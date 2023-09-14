import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class check extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
String id=req.getParameter("user");
String pass=req.getParameter("password");
try{ 
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
Statement st=con.createStatement();
String query1="select * from st where sid='"+id+"'";
ResultSet rs1=st.executeQuery(query1);

if(rs1.next())
{
   RequestDispatcher rd=req.getRequestDispatcher("books.html");
   rd.forward(req,res);
}
else{
   out.println("<script>alert('user doesnt exist')</script>");
   RequestDispatcher rd1=req.getRequestDispatcher("registration.html");
rd1.include(req,res);

}

}	 
catch(Exception e){
out.println(e);
}

}
}