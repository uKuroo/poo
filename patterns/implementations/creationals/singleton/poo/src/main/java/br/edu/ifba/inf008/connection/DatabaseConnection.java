package br.edu.ifba.inf008.connection;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private int currentValue;

    protected DatabaseConnection(){ }

    public static DatabaseConnection getInstance(){
        if(instance == null)
            instance = new DatabaseConnection();
        return instance;
    }

    public static void setIntance(DatabaseConnection connection){
        instance = connection;
    }

    public void incrementValue(){
        this.currentValue++;
    }

    public String showStatus(){
        return this.getClass().getSimpleName() + " with value: " + currentValue;
    }

}
