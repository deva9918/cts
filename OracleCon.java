package com;
import java.sql.*;
public class OracleCon {
public static void main(String[] args) {
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from jobs");
			while(rs.next())
				
				System.out.println(rs.getString(1)+""+rs.getString(2)+""+rs.getInt(3)+""+rs.getInt(4));
			con.close();
			
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
