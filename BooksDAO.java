package com.library.dao;

import java.sql.*;

import com.deloitte.library.model.Books;

public class BooksDAO {
	public static Connection connectToDB() {
		Connection connection = null;
		try {// Register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Create Connection
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
	public static void addBook(Books book) {
		System.out.println(book);
		
		
		try {
			Connection con = connectToDB();
			//Create Statement
			PreparedStatement stmt=con.prepareStatement("insert into BOOKS values(?,?,?)");
			stmt.setInt(1, book.getBookId());
			stmt.setString(2, book.getBookName());
			stmt.setFloat(3, book.getBookPrice());
			// Execure SQL query
			int affectedrows = stmt.executeUpdate();
			System.out.println("Affected Rows = "+affectedrows);
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
