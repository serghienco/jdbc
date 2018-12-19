package com.serghienco.jdbc.proxy.listener;

import java.util.EventListener;

public interface ParameterMetaDataEventListener extends EventListener {

    void beforeCreateParameterMetaData();
}
