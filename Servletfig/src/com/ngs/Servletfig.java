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
 * Servlet implementation class Servletfig
 */
@WebServlet("/Servletfig")
public class Servletfig extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletfig() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String pass = request.getParameter("password");
		System.out.println("Your username = "+ username +"\n your password = "+pass);
		
		Driver driver = new org.h2.Driver();
		try
		{

			
			DriverManager.registerDriver(driver);
 
			Connection connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
			Statement statement= connection.createStatement();
			 
			String sql1 = "insert into Users values(1,'"+username+"', '"+pass+"')";
			 
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



