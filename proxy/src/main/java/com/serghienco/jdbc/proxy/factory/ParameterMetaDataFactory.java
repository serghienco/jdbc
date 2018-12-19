package com.serghienco.jdbc.proxy.factory;

import java.sql.ParameterMetaData;
import java.sql.SQLException;

@FunctionalInterface
public interface ParameterMetaDataFactory {

    ParameterMetaData createParameterMetaData() throws SQLException;
}
