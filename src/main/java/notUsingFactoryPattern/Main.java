package notUsingFactoryPattern;

import usingFactoryPattern.DatabaseConnection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dbType = sc.nextLine();

        DatabaseConnection connection = null;

        if (dbType.equals("MySQL")) {
            connection = new MySQLConnection();
        } else if (dbType.equals("PostgreSQL")) {
            connection = new PostgreSQLConnection();
        } else if (dbType.equals("Oracle")) {
            connection = new OracleConnection();
        } else {
            throw new IllegalArgumentException("Unknown database type: " + dbType);
        }

        connection.connect();
    }
}
