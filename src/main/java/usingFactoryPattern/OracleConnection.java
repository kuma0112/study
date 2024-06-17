package usingFactoryPattern;

public class OracleConnection implements DatabaseConnection{
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle Database...");
    }
}
