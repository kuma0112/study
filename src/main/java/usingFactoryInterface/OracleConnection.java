package usingFactoryInterface;

import usingFactoryInterface.DatabaseConnection;

public class OracleConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle Database...");
    }
}
