package com.mohan;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CredentialDAO;
import model.Credential;

@WebServlet("/SignIn")
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		String emailaddress = request.getParameter("username");
		String password = request.getParameter("password");

		try 
		{
			CredentialDAO objDAO=new CredentialDAO();
			Credential cr= objDAO.validate(emailaddress, password);
			if(cr!=null) {
				response.getWriter().println("SUCCESSFULLY LOGGED IN");
			}else {
				response.getWriter().println("INVALID USERNAME OR PASSWORD");
			}
		} 
		catch (Exception e)
		{
			response.getWriter().println("Exception Arised:"+e);
		}
    }
}