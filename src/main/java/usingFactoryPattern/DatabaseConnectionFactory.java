package usingFactoryPattern;

public class DatabaseConnectionFactory {
    public static DatabaseConnection createConnection(String dbType) {
        switch (dbType) {
            case "MySQL":
                return new MySQLConnection();
            case "PostgreSQL":
                return new PostgreSQLConnection();
            case "Oracle":
                return new OracleConnection();
            default:
                throw new IllegalArgumentException("Unknown database type: " + dbType);
        }
    }
}
