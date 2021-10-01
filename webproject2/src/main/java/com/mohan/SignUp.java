package com.mohan;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CredentialDAO;

@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String dateofbirth = request.getParameter("dateofbirth");
		String emailaddress = request.getParameter("emailaddress");
		String contactnumber = request.getParameter("contactnumber");
		String password = request.getParameter("passwd");

		model.Credential obj = new model.Credential();

		obj.setFirstname(firstname);
		obj.setLastname(lastname);
		obj.setDateofbirth(dateofbirth);
		obj.setEmailaddress(emailaddress);
		obj.setContactnumber(contactnumber);
		obj.setPassword(password);

		try 
		{
			CredentialDAO objDAO=new CredentialDAO();
			objDAO.insertCredential(obj);
			out.println("<h4>Registered successfully</h4>");
		} 
		catch (Exception e)
		{
			out.println("Exception Arised:"+e);
		}
	}
}
