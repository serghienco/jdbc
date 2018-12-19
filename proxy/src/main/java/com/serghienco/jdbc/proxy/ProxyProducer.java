package com.serghienco.jdbc.proxy;

public interface ProxyProducer<T> {

    T getProxyWrap(T delegate);
}
