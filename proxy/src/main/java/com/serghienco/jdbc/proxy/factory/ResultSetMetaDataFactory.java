package com.serghienco.jdbc.proxy.factory;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

@FunctionalInterface
public interface ResultSetMetaDataFactory {

    ResultSetMetaData createResultSetMetaData() throws SQLException;
}
