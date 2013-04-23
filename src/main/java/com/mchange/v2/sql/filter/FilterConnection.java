/*
 * Distributed as part of mchange-commons-java v.0.2.5
 *
 * Copyright (C) 2013 Machinery For Change, Inc.
 *
 * Author: Steve Waldman <swaldman@mchange.com>
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of EITHER:
 *
 *     1) The GNU Lesser General Public License (LGPL), version 2.1, as 
 *        published by the Free Software Foundation
 *
 * OR
 *
 *     2) The Eclipse Public License (EPL), version 1.0
 *
 * You may choose which license to accept if you wish to redistribute
 * or modify this work. You may offer derivatives of this work
 * under the license you have chosen, or you may provide the same
 * choice of license which you have been offered here.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * You should have received copies of both LGPL v2.1 and EPL v1.0
 * along with this software; see the files LICENSE-EPL and LICENSE-LGPL.
 * If not, the text of these licenses are currently available at
 *
 * LGPL v2.1: http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 *  EPL v1.0: http://www.eclipse.org/org/documents/epl-v10.php 
 * 
 */

package com.mchange.v2.sql.filter;

import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * This class was generated by com.mchange.v2.codegen.intfc.DelegatorGenerator.
 */
public abstract class FilterConnection implements Connection
{
	protected Connection inner;
	
	
	private void __setInner( Connection inner )
	{
		this.inner = inner;
	}
	
	public FilterConnection(Connection inner)
	{ __setInner( inner ); }
	
	public FilterConnection()
	{}
	
	public void setInner( Connection inner )
	{ __setInner( inner ); }
	
	public Connection getInner()
	{ return inner; }
	
	public void commit() throws SQLException
	{
		inner.commit();
	}
	
	public void clearWarnings() throws SQLException
	{
		inner.clearWarnings();
	}
	
	public Array createArrayOf(String a, Object[] b) throws SQLException
	{
		return inner.createArrayOf(a, b);
	}
	
	public Blob createBlob() throws SQLException
	{
		return inner.createBlob();
	}
	
	public Clob createClob() throws SQLException
	{
		return inner.createClob();
	}
	
	public NClob createNClob() throws SQLException
	{
		return inner.createNClob();
	}
	
	public SQLXML createSQLXML() throws SQLException
	{
		return inner.createSQLXML();
	}
	
	public Statement createStatement(int a, int b, int c) throws SQLException
	{
		return inner.createStatement(a, b, c);
	}
	
	public Statement createStatement(int a, int b) throws SQLException
	{
		return inner.createStatement(a, b);
	}
	
	public Statement createStatement() throws SQLException
	{
		return inner.createStatement();
	}
	
	public Struct createStruct(String a, Object[] b) throws SQLException
	{
		return inner.createStruct(a, b);
	}
	
	public boolean getAutoCommit() throws SQLException
	{
		return inner.getAutoCommit();
	}
	
	public String getCatalog() throws SQLException
	{
		return inner.getCatalog();
	}
	
	public String getClientInfo(String a) throws SQLException
	{
		return inner.getClientInfo(a);
	}
	
	public Properties getClientInfo() throws SQLException
	{
		return inner.getClientInfo();
	}
	
	public int getHoldability() throws SQLException
	{
		return inner.getHoldability();
	}
	
	public DatabaseMetaData getMetaData() throws SQLException
	{
		return inner.getMetaData();
	}
	
	public int getNetworkTimeout() throws SQLException
	{
		return inner.getNetworkTimeout();
	}
	
	public String getSchema() throws SQLException
	{
		return inner.getSchema();
	}
	
	public int getTransactionIsolation() throws SQLException
	{
		return inner.getTransactionIsolation();
	}
	
	public Map getTypeMap() throws SQLException
	{
		return inner.getTypeMap();
	}
	
	public SQLWarning getWarnings() throws SQLException
	{
		return inner.getWarnings();
	}
	
	public boolean isClosed() throws SQLException
	{
		return inner.isClosed();
	}
	
	public String nativeSQL(String a) throws SQLException
	{
		return inner.nativeSQL(a);
	}
	
	public CallableStatement prepareCall(String a, int b, int c, int d) throws SQLException
	{
		return inner.prepareCall(a, b, c, d);
	}
	
	public CallableStatement prepareCall(String a, int b, int c) throws SQLException
	{
		return inner.prepareCall(a, b, c);
	}
	
	public CallableStatement prepareCall(String a) throws SQLException
	{
		return inner.prepareCall(a);
	}
	
	public PreparedStatement prepareStatement(String a, int b, int c, int d) throws SQLException
	{
		return inner.prepareStatement(a, b, c, d);
	}
	
	public PreparedStatement prepareStatement(String a, int b) throws SQLException
	{
		return inner.prepareStatement(a, b);
	}
	
	public PreparedStatement prepareStatement(String a, int[] b) throws SQLException
	{
		return inner.prepareStatement(a, b);
	}
	
	public PreparedStatement prepareStatement(String a, String[] b) throws SQLException
	{
		return inner.prepareStatement(a, b);
	}
	
	public PreparedStatement prepareStatement(String a) throws SQLException
	{
		return inner.prepareStatement(a);
	}
	
	public PreparedStatement prepareStatement(String a, int b, int c) throws SQLException
	{
		return inner.prepareStatement(a, b, c);
	}
	
	public void releaseSavepoint(Savepoint a) throws SQLException
	{
		inner.releaseSavepoint(a);
	}
	
	public void rollback() throws SQLException
	{
		inner.rollback();
	}
	
	public void rollback(Savepoint a) throws SQLException
	{
		inner.rollback(a);
	}
	
	public void setAutoCommit(boolean a) throws SQLException
	{
		inner.setAutoCommit(a);
	}
	
	public void setCatalog(String a) throws SQLException
	{
		inner.setCatalog(a);
	}
	
	public void setClientInfo(String a, String b) throws SQLClientInfoException
	{
		inner.setClientInfo(a, b);
	}
	
	public void setClientInfo(Properties a) throws SQLClientInfoException
	{
		inner.setClientInfo(a);
	}
	
	public void setHoldability(int a) throws SQLException
	{
		inner.setHoldability(a);
	}
	
	public void setNetworkTimeout(Executor a, int b) throws SQLException
	{
		inner.setNetworkTimeout(a, b);
	}
	
	public Savepoint setSavepoint() throws SQLException
	{
		return inner.setSavepoint();
	}
	
	public Savepoint setSavepoint(String a) throws SQLException
	{
		return inner.setSavepoint(a);
	}
	
	public void setSchema(String a) throws SQLException
	{
		inner.setSchema(a);
	}
	
	public void setTransactionIsolation(int a) throws SQLException
	{
		inner.setTransactionIsolation(a);
	}
	
	public void setTypeMap(Map a) throws SQLException
	{
		inner.setTypeMap(a);
	}
	
	public void setReadOnly(boolean a) throws SQLException
	{
		inner.setReadOnly(a);
	}
	
	public void close() throws SQLException
	{
		inner.close();
	}
	
	public boolean isValid(int a) throws SQLException
	{
		return inner.isValid(a);
	}
	
	public boolean isReadOnly() throws SQLException
	{
		return inner.isReadOnly();
	}
	
	public void abort(Executor a) throws SQLException
	{
		inner.abort(a);
	}
	
	public boolean isWrapperFor(Class a) throws SQLException
	{
		return inner.isWrapperFor(a);
	}
	
	public Object unwrap(Class a) throws SQLException
	{
		return inner.unwrap(a);
	}
	
}