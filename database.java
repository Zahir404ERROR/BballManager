package basketmanager;

import java.sql.*;
public class database 
{
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    database()
    {
        try{

	         Class.forName("org.postgresql.Driver");
	         con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/players","postgres", "animon123");
             pst=con.prepareStatement("select * from login where uname=? and pwd=?");
             
           }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
       
    
    public Boolean checkLogin(String uname,String pwd)
    {
        try {
                        
            pst.setString(1, uname); //this replaces the 1st  "?" in the query for username
            pst.setString(2, pwd);    //this replaces the 2st  "?" in the query for password
            //executes the prepared statement
            rs=pst.executeQuery();
            if(rs.next())
            {
                //TRUE iff the query founds any corresponding data
                return true;
            }
            else
            {
                return false;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating"+e);
            return false;
        }
}}