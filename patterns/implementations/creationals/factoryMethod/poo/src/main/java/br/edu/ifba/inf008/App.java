package br.edu.ifba.inf008;

import br.edu.ifba.inf008.abstact.Connection;
import br.edu.ifba.inf008.factory.MySQLConnectionFactory;
import br.edu.ifba.inf008.factory.SQLiteConnectionFactory;
import br.edu.ifba.inf008.interfaces.ConnectionFactory;

public class App 
{
    public static void run(ConnectionFactory factory){
        Connection conn = factory.createConnection();

        conn.showType();
    }

    public static void main(String[] args)
    {
        run(new MySQLConnectionFactory());
        run(new SQLiteConnectionFactory());
    }
}
