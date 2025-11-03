package br.edu.ifba.inf008.connection;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private String connection;
    private int currentValue;

    private DatabaseConnection(){
        this.connection = "DbConnection";
    }

    public static DatabaseConnection getInstance(){
        if(instance == null)
            instance = new DatabaseConnection();
        return instance;
    }

    public void incrementValue(){
        this.currentValue++;
    }

    public String showStatus(){
        return this.connection + " with value: " + currentValue;
    }

}
