package liarsDice;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;


public class Database {
	private Connection connection;
	
	public Database() throws IOException, SQLException{
		//Create Properties
		Properties properties = new Properties();
		FileInputStream fs = new FileInputStream("liarsDice/db.properties");
		
		properties.load(fs);
		String user = properties.getProperty("user");
		String password = properties.getProperty("password");
		String url = properties.getProperty("url");
		
		connection = DriverManager.getConnection(url, user, password);
	}
	
	public void executeDML(String dml) throws SQLException {
		Statement statement = connection.createStatement();
		statement.execute(dml);
		System.out.println(dml);
	}
	
	public ArrayList<String> query(String query) throws SQLException{
		ArrayList<String> list = new ArrayList<>();		
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(query);
		list.add(query);
		
		return list;
	}
	
}