package lairsDice;

import java.sql.*;
import java.io.*;
import java.util.*;

public class Database
{

  public static void main(String[] args) throws IOException
  {
    // TODO Auto-generated method stub
    //Class.forName("com.mysql.jdbc.Driver");  
   
    
    Connection con;
    Statement stmt;
    ResultSet rs;
    ResultSetMetaData rmd;
    
    //Read properties file
    Properties prop = new Properties();
    FileInputStream fis = new FileInputStream("mySQL/db.properties");
    prop.load(fis);
    String url = prop.getProperty("url");
    String user = prop.getProperty("user");
    String pass = prop.getProperty("password");    
    
    
    try
    {
      //Read the connection properties as Strings
    
      
      //Perform the Connection
      con = DriverManager.getConnection(url,user,pass);
    
      //Create a statement
      stmt=con.createStatement();  
      
      //Execute a DML statement
      stmt.execute("insert into player values('user','pass','jim',2,1)");
    
      //Execute a query
      rs=stmt.executeQuery("select * from test1");  
      
      //Get metadata about the query
      rmd = rs.getMetaData();
      
      //Get the # of columns
      int no_columns = rmd.getColumnCount();
    
      //Get a column name
      String name = rmd.getColumnName(1);
      
      //Fetch each row (use numeric numbering
      while(rs.next()) 
      {
        System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
      }
      
      con.close();  
    
      System.out.println("Success");
    } 
    catch (SQLException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } 

  }

}
