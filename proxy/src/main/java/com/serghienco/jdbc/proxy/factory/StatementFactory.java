package com.serghienco.jdbc.proxy.factory;

import java.sql.SQLException;
import java.sql.Statement;

@FunctionalInterface
public interface StatementFactory<T extends Statement> {

    T createStatement() throws SQLException;
}
