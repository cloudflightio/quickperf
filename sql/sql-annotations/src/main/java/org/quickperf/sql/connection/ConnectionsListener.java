/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 *
 * Copyright 2019-2021 the original author or authors.
 */

package org.quickperf.sql.connection;

import org.quickperf.TestExecutionContext;
import org.quickperf.perfrecording.PerfRecord;
import org.quickperf.perfrecording.RecordablePerformance;

import java.sql.Connection;
import java.sql.Savepoint;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

@SuppressWarnings({"EmptyMethod", "unused"})
public abstract class ConnectionsListener<R extends PerfRecord> implements RecordablePerformance<R> {

    public void getFromTheDataSource(Connection connection) {
    }

    public void close(Connection connection){
    }

    public void createStatement(Connection connection) {
    }

    public void prepareStatement(Connection connection, String sql) {
    }

    public void prepareCall(Connection connection, String sql) {
    }

    public void nativeSQL(Connection connection, String sql) {
    }

    public void setAutoCommit(Connection connection, boolean autoCommit) {
    }

    public void commit(Connection connection) {
    }

    public void rollback(Connection connection) {
    }

    public void setReadOnly(Connection connection, boolean readOnly) {
    }

    public void setCatalog(Connection connection, String catalog) {
    }

    public void setTransactionIsolation(Connection connection, int level) {
    }

    public void clearWarnings(Connection connection) {
    }

    public void createStatement(Connection connection, int resultSetType, int resultSetConcurrency) {
    }

    public void prepareStatement(Connection connection, String sql, int resultSetType, int resultSetConcurrency) {
    }

    public void prepareCall(Connection connection, String sql, int resultSetType, int resultSetConcurrency) {
    }

    public void setTypeMap(Connection connection, Map<String, Class<?>> map) {
    }

    public void setHoldability(Connection connection, int holdability) {
    }

    public void setSavepoint(Connection connection) {
    }

    public void setSavepoint(Connection connection, String name) {
    }

    public void rollback(Connection connection, Savepoint savepoint) {
    }

    public void releaseSavepoint(Connection connection, Savepoint savepoint) {
    }

    public void createStatement(Connection connection, int resultSetType, int resultSetConcurrency, int resultSetHoldability) {
    }

    public void prepareStatement(Connection connection, String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) {
    }

    public void prepareCall(Connection connection, String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) {
    }

    public void prepareStatement(Connection connection, String sql, int autoGeneratedKeys) {
    }

    public void prepareStatement(Connection connection, String sql, int[] columnIndexes) {
    }

    public void prepareStatement(Connection connection, String sql, String[] columnNames) {
    }

    public void createClob(Connection connection) {
    }

    public void createBlob(Connection connection) {
    }

    public void createNClob(Connection connection) {
    }

    public void createSQLXML(Connection connection) {
    }

    public void setClientInfo(Connection connection, String name, String value) {
    }

    public void setClientInfo(Connection connection, Properties properties) {
    }

    public void createArrayOf(Connection connection, String typeName, Object[] elements) {
    }

    public void createStruct(Connection connection, String typeName, Object[] attributes) {
    }

    public void setSchema(Connection connection, String schema) {
    }

    public void abort(Connection connection, Executor executor) {
    }

    public void setNetworkTimeout(Connection connection, Executor executor, int milliseconds) {
    }

    @Override
    public abstract void startRecording(TestExecutionContext testExecutionContext);

    @Override
    public abstract void stopRecording(TestExecutionContext testExecutionContext);

    @Override
    public abstract R findRecord(TestExecutionContext testExecutionContext);

    @Override
    public abstract void cleanResources();

}
