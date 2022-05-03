package com.genericA51;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class FirstGenericA51 extends GenericServlet 
{
	public void service(ServletRequest req, ServletResponse res) throws IOException
	{
		System.out.println("Servlet Performing...");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<h1>This is my first GenericServlet</h1>");
	}

}
