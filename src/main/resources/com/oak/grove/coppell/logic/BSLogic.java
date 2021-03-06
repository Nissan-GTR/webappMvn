package com.oak.grove.coppell.logic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oak.grove.coppell.Welcome;

/**
 * Servlet implementation class BSLogic
 */
@WebServlet(description = "simple logic", urlPatterns = { "/BSLogic" })
public class BSLogic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BSLogic() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// Set response content type
	      response.setContentType("text/html");

	      PrintWriter out = response.getWriter();
	      String title = "Welcome Mate !!!! ";
	      
	      Welcome come = new Welcome();
	  	  String fname = request.getParameter("first_name") ;
	  	  String lname = request.getParameter("last_name") ;
	  	  String gender = request.getParameter("gender") ;
	  	
	      String greets = come.sayHola(fname + " " + lname, gender);
	  	
	      
	      String docType =
	         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	       
	      
	      
	      out.println(docType +
	         "<html>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body bgcolor = \"#f0f0f0\">\n" +
	               "<h1 align = \"center\">" + title + "</h1>\n" +
	               "<ul>\n" +
	                  "  Greetings : "
	                  + greets + "\n" +
	               "</ul>\n" +
	            "</body>" +
	         "</html>"
	      );
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
