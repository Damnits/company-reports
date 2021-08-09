package br.edu.ifpb.report.database;

public class PostgreSQLDatabaseConnector implements Connector {

    public void createConnection() {
        System.out.println("Create postgres connection");
    }
    public void executeQuery(String query) { System.out.println("Run SQL query"); }

}
