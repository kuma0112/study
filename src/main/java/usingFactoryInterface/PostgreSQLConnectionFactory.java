package usingFactoryInterface;

public class PostgreSQLConnectionFactory implements DatabaseConnectionFactory{
    @Override
    public DatabaseConnection createConnection() {
        return new PostgreSQLConnection();
    }
}
