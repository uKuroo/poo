package br.edu.ifba.inf008.factory;

import br.edu.ifba.inf008.abstact.Connection;
import br.edu.ifba.inf008.concret.MySQLConnection;
import br.edu.ifba.inf008.interfaces.ConnectionFactory;

public class MySQLConnectionFactory implements ConnectionFactory {

    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

}
