package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class oracleInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
				//Statement stmt= con.createStatement();
				PreparedStatement st=con.prepareStatement("insert into jobs values(?,?,?,?)");
				st.setString(1,"aj123");
				st.setString(2,"programmer");
				st.setInt(3, 1234);
				st.setInt(4,10000);
				int i=st.executeUpdate();
				System.out.println(i+"records inserted");
				
				con.close();
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
