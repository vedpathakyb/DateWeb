import java.util.*;
import java.io.*;
import javax.servlet.*;
//import jakarta.servlet.*;
import javax.servlet.http.*;
//import jakarta.servlet.http.*;
public class DateServlet extends HttpServlet 
{
public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();
Date d=new Date();
out.println("<html>");
out.println("<body>");
out.println(" "+d);
out.println("</body>");
out.println("</html>");
}
}

