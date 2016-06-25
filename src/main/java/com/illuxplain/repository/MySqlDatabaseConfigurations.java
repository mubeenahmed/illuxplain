package com.illuxplain.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDatabaseConfigurations {
	//jdbc:mysql://$OPENSHIFT_MYSQL_DB_HOST:$OPENSHIFT_MYSQL_DB_PORT/burgerjoint
	private static Connection connection;
	private static final String username = "adminWj3LtJS";
	private static final String password = "jmMLPhqVhMra";
	//private static final String host =  System.getenv("OPENSHIFT_MYSQL_DB_HOST");
	//private static final String port =  System.getenv("OPENSHIFT_MYSQL_DB_PORT");
	//private static final String URL = "jdbc:mysql://"+host+":"+port+"/illuxplain";
	private static final String URL = "jdbc:mysql://$OPENSHIFT_MYSQL_DB_HOST:$OPENSHIFT_MYSQL_DB_PORT/illuxplain";
	//private static final String URL = "jdbc:mysql://127.0.0.1:3307/illuxplain";

	
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL,username,password);
		
			return connection;
	}
	public static void closeConnection() throws SQLException{
			connection.close();
	}
}
