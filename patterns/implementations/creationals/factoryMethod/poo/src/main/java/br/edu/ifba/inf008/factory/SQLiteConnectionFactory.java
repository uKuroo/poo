package br.edu.ifba.inf008.factory;

import br.edu.ifba.inf008.abstact.Connection;
import br.edu.ifba.inf008.concret.SQLiteConnection;
import br.edu.ifba.inf008.interfaces.ConnectionFactory;

public class SQLiteConnectionFactory implements ConnectionFactory {

    @Override
    public Connection createConnection() {
        return new SQLiteConnection();
    }

}
