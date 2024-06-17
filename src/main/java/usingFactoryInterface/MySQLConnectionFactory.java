package usingFactoryInterface;

public class MySQLConnectionFactory implements DatabaseConnectionFactory{
    @Override
    public DatabaseConnection createConnection() {
        return new MySQLConnection();
    }
}
