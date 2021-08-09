package br.edu.ifpb.report.database;

public interface Connector {
    public abstract void createConnection();
    public abstract void executeQuery(String query);
}