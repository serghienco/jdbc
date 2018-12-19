package com.serghienco.jdbc.proxy.factory;

import java.sql.ResultSet;
import java.sql.SQLException;

@FunctionalInterface
public interface ResultSetFactory {

    ResultSet createResultSet() throws SQLException;
}
