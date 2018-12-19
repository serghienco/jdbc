package com.serghienco.jdbc.proxy.factory;

import java.sql.Connection;
import java.sql.SQLException;

@FunctionalInterface
public interface ConnectionFactory {

    Connection createConnection() throws SQLException;
}
