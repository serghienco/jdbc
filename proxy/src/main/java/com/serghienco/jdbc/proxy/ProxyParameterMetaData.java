package com.serghienco.jdbc.proxy;

import com.serghienco.jdbc.proxy.factory.ParameterMetaDataFactory;
import com.serghienco.jdbc.proxy.listener.ParameterMetaDataEventListener;

import java.sql.ParameterMetaData;
import java.sql.SQLException;
import java.util.Objects;

public class ProxyParameterMetaData implements ParameterMetaData {

    private final ParameterMetaData delegate;
    private final ParameterMetaDataEventListener listener;

    public ProxyParameterMetaData(ParameterMetaDataFactory factory, ParameterMetaDataEventListener listener)
            throws SQLException {
        (this.listener = listener).beforeCreateParameterMetaData();
        this.delegate = Objects.requireNonNull(factory.createParameterMetaData());
    }

    @Override
    public int getParameterCount() throws SQLException {
        return delegate.getParameterCount();
    }

    @Override
    public int isNullable(int param) throws SQLException {
        return delegate.isNullable(param);
    }

    @Override
    public boolean isSigned(int param) throws SQLException {
        return delegate.isSigned(param);
    }

    @Override
    public int getPrecision(int param) throws SQLException {
        return delegate.getPrecision(param);
    }

    @Override
    public int getScale(int param) throws SQLException {
        return delegate.getScale(param);
    }

    @Override
    public int getParameterType(int param) throws SQLException {
        return delegate.getParameterType(param);
    }

    @Override
    public String getParameterTypeName(int param) throws SQLException {
        return delegate.getParameterTypeName(param);
    }

    @Override
    public String getParameterClassName(int param) throws SQLException {
        return delegate.getParameterClassName(param);
    }

    @Override
    public int getParameterMode(int param) throws SQLException {
        return delegate.getParameterMode(param);
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return delegate.unwrap(iface);
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return delegate.isWrapperFor(iface);
    }
}
