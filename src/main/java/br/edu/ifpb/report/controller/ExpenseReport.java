package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport extends Report {


    public Connector createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        return new PostgreSQLDatabaseConnector;
    }

    public void executeQuery() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        connector.runQuery(query);
    }

    public void convert() {
        System.out.println("Converting To XLS...");
    }

}
