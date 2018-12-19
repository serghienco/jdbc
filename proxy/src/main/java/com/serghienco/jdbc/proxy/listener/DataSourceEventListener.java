package com.serghienco.jdbc.proxy.listener;

import java.util.EventListener;

public interface DataSourceEventListener extends EventListener {

    void beforeCreateDataSource();

    ConnectionEventListener createConnectionEventListener();
}
