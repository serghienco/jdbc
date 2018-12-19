package com.serghienco.jdbc.proxy.listener;

import java.util.EventListener;

public interface DatabaseMetaDataEventListener extends EventListener {

    void beforeCreateDatabaseMetaData();

    ResultSetEventListener createResultSetEventListener();
}
