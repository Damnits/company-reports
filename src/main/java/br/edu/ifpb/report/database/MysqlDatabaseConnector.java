package br.edu.ifpb.report.database;

public class MysqlDatabaseConnector implements Connector {

    public void createConnection() {
        System.out.println("Create mysql connection");
    }

    public void executeQuery(String query) {
        System.out.println("Run SQL query");
    }

}
