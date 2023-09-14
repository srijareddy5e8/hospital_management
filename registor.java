import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class registor extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();  
String pass=req.getParameter("pass");  
String id=req.getParameter("stid");  
 
try{ 
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
    Statement st=con.createStatement();
    String query1="select * from st where sid='"+id+"'";
    ResultSet rs1=st.executeQuery(query1);
    if(rs1.next())
    {   out.println("<font color='red'>user already exist! Login to access </font>");
        RequestDispatcher rd1=req.getRequestDispatcher("index.html");
        rd1.include(req,res);
    }
    else{
        String query2="insert into st values(id,pass)";
        int x=st.executeUpdate(query2);
        if(x==1)
        {
            out.println("<script>alert('You are Succesfully Registered')</script>");
            RequestDispatcher rd1=req.getRequestDispatcher("index.html");
            rd1.include(req,res);
        }


    }  
      
          
}catch (Exception e2) {System.out.println(e2);}  
          
out.close();  
}  
  
}