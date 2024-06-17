package usingFactoryInterface;

public class OracleConnectionFactory implements DatabaseConnectionFactory{
    @Override
    public DatabaseConnection createConnection() {
        return new OracleConnection();
    }
}
