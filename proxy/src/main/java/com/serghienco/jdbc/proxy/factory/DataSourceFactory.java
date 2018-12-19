package com.serghienco.jdbc.proxy.factory;

import javax.sql.DataSource;

@FunctionalInterface
public interface DataSourceFactory {

    DataSource createDataSource();
}
