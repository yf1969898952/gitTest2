package com.netease;



import java.io.IOException;

import java.io.PrintWriter;

import java.util.Date;


import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;


import org.apache.log4j.Logger;


public class NoodlesServlet extends HttpServlet {

  
	static  Logger log = Logger.getLogger(NoodlesServlet.class.getName());  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        			PrintWriter writer = response.getWriter();
        
		String vegetable = request.getParameter("vegetable");
        		
		if (vegetable == null) {
            
			vegetable = "Tomato";
        
		}

 
		log.error(vegetable);       
		writer.println("<html><body>");
        
		writer.println("<h1> Noodles with " + vegetable + "</h1>"); 
        
		writer.println("</body></html>");
    
	}


}
