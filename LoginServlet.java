import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
* Servlet implementation class LoginServlet
*/
@WebServlet("/LoginD")
public class LoginServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
java.io.PrintWriter out;
RequestDispatcher dis;
/**
* @see HttpServlet#HttpServlet()
*/
public LoginServlet() 
	{
		super();
	}
/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		out=response.getWriter();
		String log=request.getParameter("tlogin");
		String pass=request.getParameter("tpass");
		if(log.equals("admin")&&pass.equals("admin"))
		{
			dis=getServletContext().getRequestDispatcher("/Welcome.html");
			dis.forward(request, response);
			out.println("Valid User");
		}
		else
		{
			dis=getServletContext().getRequestDispatcher("/Login.html");
			dis.include(request, response);
			out.println("<font color=red> Invalid id or password");
		}
	}
}
