package com.ngs;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterValidation
 */
@WebServlet("/RegisterValidation")
public class RegisterValidation extends HttpServlet {
	 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String gmail = request.getParameter("gmail");
		String phoneno = request.getParameter("phoneno");
		System.out.println("Your username = "+ firstname +"\n your password = "+lastname);
		
		Driver driver = new org.h2.Driver();
		try
		{

			
			DriverManager.registerDriver(driver);
 
			Connection connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
			Statement statement= connection.createStatement();
			 
			String sql1 = "select * from registeration where phone =889746618";
			 
			statement.execute(sql1);
			connection.close();
			System.out.println("Updated successfully");


		}
			catch(Exception e)
			{
				System.out.println("Exception: "+e.getMessage());
			}
		}

	}


