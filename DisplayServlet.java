import java.util.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
* Servlet implementation class DisplayServlet
*/
@WebServlet("/Display")
public class DisplayServlet extends HttpServlet 
	{
		private static final long serialVersionUID = 1L;

/**
* @see HttpServlet#HttpServlet()
*/
public DisplayServlet() 
	{
		super();
	}

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		java.io.PrintWriter out=response.getWriter();
		/*javax.servlet.ServletContext sc=getServletContext();
	java.util.List<Employee> elist=(List<Employee>)sc.getAttribute("employeelist");
	for(Employee e:elist)
	{

	out.println("Employee id "+e.getEmpid()+"<br>");
	out.println("Employee name "+e.getEmpname()+"<br>");
	out.println("Salary "+e.getSalary()+"<br>");
	}*/
		HttpSession ses1=request.getSession(false);//it will use existing session if exist
		//otherwise it will not create new session
		List<Employee> elist=(List<Employee>)ses1.getAttribute("employee1");
		for(Employee e1:elist)
		{
			out.print(e1.getEmpid() + " ");
			out.println("Employee name "+e1.getEmpname());
			out.println("Salary "+e1.getSalary());
			out.println();
		}

}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}

}
