package br.edu.ifpb.report.controller;

public abstract class Report {
    final public void generate(){
        createDatabaseConnection();
        executeQuery();
        convert();
    }
    protected abstract void convert();

    protected abstract void executeQuery();

    public abstract Connector createDatabaseConnection();
}
