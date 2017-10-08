
package onlinefir;

import java.sql.*;
//import com.sun.org.apache.xml.internal.resolver.helpers.*;

class dbconnection 
{
    public Connection con;
     dbconnection()
    {
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crime","root","");
             System.out.println("connection");
        }catch(Exception e){
            System.out.println("Exception:::"+e);
        }
    }
    public static void main(String[] args) 
    {
        new dbconnection();
    }
}
