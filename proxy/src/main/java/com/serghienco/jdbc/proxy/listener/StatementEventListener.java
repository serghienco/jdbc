package com.serghienco.jdbc.proxy.listener;

import java.util.EventListener;

public interface StatementEventListener extends EventListener {

    void beforeCreateStatement();

    ResultSetEventListener createResultSetEventListener();

    ResultSetMetaDataEventListener createResultSetMetaDataEventListener();

    ParameterMetaDataEventListener createParameterMetaDataEventListener();
}
