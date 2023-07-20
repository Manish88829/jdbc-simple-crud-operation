package com.jspider.jdbc_simple_crude_operration_controller;

import java.sql.DriverManager;

public class StudentInsertController {

	public static void main(String[] args)
    {
    	//step1:load the driver
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step2: create connection
			String url = "jdbc:mysql:/localhost:3306/jffsrd-m3";
			String user = "root";
			String pass = "Test";
			
			DriverManager.getConnection(url,user,pass);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
