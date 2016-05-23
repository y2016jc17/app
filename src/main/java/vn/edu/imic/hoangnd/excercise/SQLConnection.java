package vn.edu.imic.hoangnd.excercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
	public static Connection getSQLServerConnection()
	         throws SQLException, ClassNotFoundException {
	     String hostName = "localhost";
	     String sqlInstanceName = "SQLEXPRESS";
	     String database = "mydb";
	     String userName = "sa";
	     String password = "admin#1";
	 
	     return getSQLServerConnection(hostName, sqlInstanceName,
	             database, userName, password);
	 }

	 public static Connection getSQLServerConnection(String hostName,
	         String sqlInstanceName, String database, String userName,
	         String password) throws ClassNotFoundException, SQLException {

	     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	 

	     String connectionURL = "jdbc:sqlserver://" + hostName + ":1433"
	             + ";instance=" + sqlInstanceName + ";databaseName=" + database;
	 
	     Connection conn = DriverManager.getConnection(connectionURL, userName,
	             password);
	     return conn;
	 }
}
