package com.serghienco.jdbc.proxy.listener;

public interface ConnectionEventListener {

    void beforeCreateConnection();

    StatementEventListener createStatementEventListener();

    DatabaseMetaDataEventListener createDatabaseMetaDataEventListener();
}
