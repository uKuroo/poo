package br.edu.ifba.inf008;

import br.edu.ifba.inf008.connection.DatabaseConnection;

public class App 
{
    public static void main(String[] args)
    {
        DatabaseConnection dbC1 = DatabaseConnection.getInstance();
        DatabaseConnection dbC2 = DatabaseConnection.getInstance();

        System.out.println(dbC1.showStatus());

        dbC1.incrementValue();
        
        System.out.println(dbC2.showStatus());
    }
}
