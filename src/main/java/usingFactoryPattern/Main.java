package usingFactoryPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dbType = sc.nextLine();

        DatabaseConnection connection = DatabaseConnectionFactory.createConnection(dbType);
        connection.connect();
    }
}
