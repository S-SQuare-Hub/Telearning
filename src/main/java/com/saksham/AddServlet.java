package com.saksham;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws
	IOException,ServletException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int r=i+j;
		PrintWriter out=res.getWriter();
		out.println("result is : "+r);
	}
}
