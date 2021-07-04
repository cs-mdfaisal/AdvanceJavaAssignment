package com.phoenix.web.welcome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * @author md.faisal
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String uname = request.getParameter("username");
		
		//Get Http session
		HttpSession session = request.getSession();
		//set session time
		session.setMaxInactiveInterval(5);
		
		//checking session id
		System.out.println("Session id in WelcomeServlet: "+session.getId());
		
		//Maintain state of client
		session.setAttribute("user", uname);
		
		//Encoding Url by appendig session id if cookie is inactive
		String encodedProductUrl = response.encodeRedirectURL("products");
		System.out.println("Encoded url: "+encodedProductUrl);
		
		PrintWriter out = response.getWriter();
		//html successful response to user
		out.println("<body bgcolor='#99ffe7'>"+"<h2>Dear "+ uname +" Welcome to phoenix online shoppe"
				+ "</h2>"+"<h3>Session Time out : " + session.getMaxInactiveInterval() + " seconds</h3>"+
		"<h3>To view products <a href='"+encodedProductUrl+"'>Click Here</a></h3>"+"</body>");
		//response.sendRedirect("https://www.google.com");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
