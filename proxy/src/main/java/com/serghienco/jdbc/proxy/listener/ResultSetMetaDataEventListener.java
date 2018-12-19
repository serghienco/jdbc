package com.serghienco.jdbc.proxy.listener;

import java.util.EventListener;

public interface ResultSetMetaDataEventListener extends EventListener {

    void beforeCreateResultSetMetaData();
}
