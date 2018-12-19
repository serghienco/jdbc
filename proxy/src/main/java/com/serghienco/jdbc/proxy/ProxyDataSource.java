package com.serghienco.jdbc.proxy;

import com.serghienco.jdbc.proxy.factory.ConnectionFactory;
import com.serghienco.jdbc.proxy.factory.DataSourceFactory;
import com.serghienco.jdbc.proxy.listener.DataSourceEventListener;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Objects;
import java.util.logging.Logger;

public class ProxyDataSource implements DataSource {

    private final DataSource delegate;
    private final DataSourceEventListener listener;

    public ProxyDataSource(DataSource delegate, DataSourceEventListener listener) {
        this(() -> delegate, listener);
    }

    public ProxyDataSource(DataSourceFactory factory, DataSourceEventListener listener) {
        (this.listener = listener).beforeCreateDataSource();
        this.delegate = Objects.requireNonNull(factory.createDataSource());
    }

    private ProxyConnection createProxyConnection(ConnectionFactory factory) throws SQLException {
        return new ProxyConnection(factory, this.listener.createConnectionEventListener());
    }

    @Override
    public Connection getConnection() throws SQLException {
        return createProxyConnection(() -> delegate.getConnection());
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return createProxyConnection(() -> delegate.getConnection(username, password));
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return delegate.getLogWriter();
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {
        delegate.setLogWriter(out);
    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return delegate.getLoginTimeout();
    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {
        delegate.setLoginTimeout(seconds);
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return delegate.getParentLogger();
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
