package com.illuxplain.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class VistorInfo {

	private String sql = "INSERT INTO illuxplain.my_vistors(vistor_country) value(?)";
	private PreparedStatement ps;
	
	public void storeVistor(String visit){
		DatabaseConfiguration configuration = new DatabaseConfiguration();
		Connection connection = configuration.getConnection();
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, visit);
			
			ps.execute();
			configuration.closeConnection();
			
		} catch (SQLException e) {
			e.printStackTrace();
			configuration.closeConnection();
		}
	}
	
}
