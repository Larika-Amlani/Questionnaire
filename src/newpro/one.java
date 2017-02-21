package newpro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javafx.application.Application;
import javafx.stage.Stage;




	
	
	
	public class one  {
	   // JDBC driver name and database URL
	   public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   public static final String DB_URL = "jdbc:mysql://localhost:3306/project";
	   public static int flag=0,pg1,pg2,pg3,pg4,pg5,pg6,pg7;
	   public static String nme;
	   
	 
	   //  Database credentials
	   public static final String USER = "root";
	   public static final String PASS = "larika2012";
	   public   Connection conn = null;
	   public static long age;
	   public static int arr[]=new int[20];
	   public static int count;
	  
	
	   public void main(String[] args) throws SQLException {

	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	     
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);
	     
	      
	   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
	   }
	
	
	   }
	
	


	}