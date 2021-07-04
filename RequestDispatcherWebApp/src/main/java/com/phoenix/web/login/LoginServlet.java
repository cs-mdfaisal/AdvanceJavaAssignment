package com.phoenix.web.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginS")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//Retrive Request parameters
				String uname = request.getParameter("username");
				String password = request.getParameter("passwd");
				
				//get output stream
				PrintWriter out = response.getWriter();
				
				//Validate users
				if(uname!=null && password!=null && uname.equals("faisal") && password.equals("123")) {
					RequestDispatcher rd = request.getRequestDispatcher("welcome");
					rd.forward(request, response);
					
				}else
				{//Invalid Login
					out.println("<h3 style = 'color:red;' > Invalid Login</h3>");
					//It will redirect to same page
					RequestDispatcher rd = request.getRequestDispatcher("login.html");
					rd.include(request, response);
				}
				//close output stream
				out.close();
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
