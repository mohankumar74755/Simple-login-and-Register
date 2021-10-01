package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Credential;

public class CredentialDAO {
	
	Connection conn;
	
	public CredentialDAO()throws Exception
	{
		conn=utility.DBConn.getMySQLConnection();
	}

	public void insertCredential(Credential credential)throws Exception
{
		PreparedStatement psmt=conn.prepareStatement("insert into Customer Values(?,?,?,?,?,?)"); 
		
		psmt.setString(1, credential.getFirstname());
		psmt.setString(2, credential.getLastname());
		psmt.setString(3, credential.getDateofbirth());
		psmt.setString(4, credential.getEmailaddress());
		psmt.setString(5, credential.getContactnumber());
		psmt.setString(6, credential.getPassword());

        int row_eff=psmt.executeUpdate();

   }
	
	public Credential validate(String userid,String pwd) throws Exception {
		   PreparedStatement psmt=conn.prepareStatement("select * from Customer where emailaddress=? and password=?"); 
		   psmt.setString(1, userid);
		   psmt.setString(2, pwd);
		   ResultSet rs=psmt.executeQuery();
		   if(rs.next()){
			   Credential cd=new Credential();
			   cd.setEmailaddress(rs.getString("emailaddress"));
			   cd.setFirstname(rs.getString("firstname"));
			   cd.setFirstname(rs.getString("lastname"));
			   cd.setFirstname(rs.getString("contactnumber"));
			   return cd;
		   }
		   return null;
	   }
	
}
