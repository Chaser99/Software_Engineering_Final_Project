package lairsDice;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class DatabaseFileTest {

	String[] username = {"jim","john","tim","joe"};
	String[] password = {"hello123","pass123","123456","hello1234"};

	private DatabaseFile db; 
	private int rando;
	
	@Before
	
	public void setUp() throws Exception 
	{
	  db = new DatabaseFile(); 
	  db.setStream("liarsDice/users.txt");
	  rando = ((int)Math.random()*users.length); 
	}
	
	@Test
	public void testSetStream() throws FileNotFoundException
	{
	  //1. call setStream() with users.txt
		db.setStream("liarsDice/users.txt");

	  //2. call getStream() and return a FileInputStream object (fis)
		FileInputStream fis = db.getStream();
	  //3. make sure FileInputStream object returned by getStream is not null
			
	  assertNotNull("Check setStream", fis); //Place object here 
			
			
	}
	
	@Test
	public void testQuery() throws IOException 
	{
	  //Use Random # to extract username/ and expected password
			
			
	 String username = users[rando]; 
	 String expected = passwords[rando];
			
	 //get actual result (invoke query with username
			
	 
			
	//compare expected with actual using assertEquals
			
			
			
	}
		
	@Test  //Test for bad user name
	public void testQuery2() throws IOException
	{
			
	  //Set bad username to an invalid name
	  		
	 //Extract actual name based on bad user name
			
	 //compare actual with assertNull 
			
	 assertNull("Check query", fis); 
	}



}