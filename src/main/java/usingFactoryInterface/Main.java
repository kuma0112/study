package usingFactoryInterface;

public class Main {
    public static void main(String[] args) {
        DatabaseConnectionFactory factory = new MySQLConnectionFactory();
        DatabaseConnection connection = factory.createConnection();
        connection.connect();
    }
}
