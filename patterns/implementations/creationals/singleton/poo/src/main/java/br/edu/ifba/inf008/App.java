package br.edu.ifba.inf008;

import br.edu.ifba.inf008.connection.DatabaseConnection;
import br.edu.ifba.inf008.connection.SQLiteConnection;

public class App 
{
    public static void run1(){
        DatabaseConnection dbC1 = DatabaseConnection.getInstance();
        DatabaseConnection dbC2 = DatabaseConnection.getInstance();

        System.out.println(dbC1.showStatus());

        dbC1.incrementValue();
        
        System.out.println(dbC2.showStatus());
    }
    
    public static void run2(){
        DatabaseConnection dbC1 = DatabaseConnection.getInstance();
        System.out.println(dbC1.showStatus());

        DatabaseConnection.setIntance(new SQLiteConnection());

        DatabaseConnection dbC2 = DatabaseConnection.getInstance();
        
        System.out.println(dbC2.showStatus());
    }

    public static void main(String[] args)
    {
        run1();

        System.out.println("Now with inheritance:");

        run2();
    }
}
