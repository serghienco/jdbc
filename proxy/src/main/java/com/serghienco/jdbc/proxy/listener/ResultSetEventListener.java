package com.serghienco.jdbc.proxy.listener;

import java.util.EventListener;

public interface ResultSetEventListener extends EventListener {

    void beforeCreateResultSet();

    ResultSetMetaDataEventListener createResultSetMetaDataEventListener();
}
