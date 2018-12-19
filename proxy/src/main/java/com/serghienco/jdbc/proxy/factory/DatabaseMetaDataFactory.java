package com.serghienco.jdbc.proxy.factory;

import java.sql.DatabaseMetaData;
import java.sql.SQLException;

@FunctionalInterface
public interface DatabaseMetaDataFactory {

    DatabaseMetaData createDatabaseMetaData() throws SQLException;
}
