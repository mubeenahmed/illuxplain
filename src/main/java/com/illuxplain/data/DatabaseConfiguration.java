package com.illuxplain.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfiguration {
	//jdbc:mysql://$OPENSHIFT_MYSQL_DB_HOST:$OPENSHIFT_MYSQL_DB_PORT/burgerjoint
	private Connection connection;
	private static final String username = "adminiXBfa48";
	private static final String password = "ZcinB3q5DkUz";
	private static final String host =  System.getenv("OPENSHIFT_MYSQL_DB_HOST");
	private static final String port =  System.getenv("OPENSHIFT_MYSQL_DB_PORT");
	private static final String URL = "jdbc:mysql://"+host+":"+port+"/illuxplain";
	
	
	public Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
	public void closeConnection(){
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
