package com.tka.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtil 
{
	public static void LoadDriver(String driverName) throws ClassNotFoundException
	{
		Class.forName(driverName);
	}
	
	public static Connection createConnection(String url,String username,String password) throws SQLException 
	{
		Connection connection=DriverManager.getConnection(url,username,password);
		return connection;
	}
	
	//Option_1
	public static Statement createStatement1(Connection connection) throws SQLException
	{
		return connection.createStatement();
	}
	
	//Option_2
	public static Statement createStatement2() throws SQLException
	{
		Connection connection = DatabaseUtil.createConnection("jdbc:mysql://localhost:3306/jdbccollection","root","root");
		return connection.createStatement();
	}
	
	//Option_3
	public static Statement createStatement3(String url,String username,String password) throws SQLException
	{
		Connection connection=createConnection(url, username, password);
		Statement statement=connection.createStatement();
		return statement;
	}
	
	public static ResultSet generateResultSet(String sql,Statement statement) throws SQLException
	{
		ResultSet rs = statement.executeQuery(sql);
		return rs;
	}
}
