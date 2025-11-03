package br.edu.ifba.inf008;

import br.edu.ifba.inf008.abstact.Connection;
import br.edu.ifba.inf008.factory.MySQLConnectionFactory;
import br.edu.ifba.inf008.interfaces.ConnectionFactory;

public class App 
{
    public static void main(String[] args)
    {
        ConnectionFactory factory = new MySQLConnectionFactory();
        Connection connection = factory.createConnection();

        connection.showType();
    }
}
