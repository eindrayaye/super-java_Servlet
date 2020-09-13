import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;
/**
* Servlet implementation class EmployeeVal
*/
public class EmployeeVal extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private Scanner sc;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeVal() 
	{		

		super();
	}
	private List<Employee> emplist;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		sc=new Scanner(System.in);
		emplist=new ArrayList<Employee>();
		for(int x=1;x<=3;x++)
		{

			Employee e=new Employee();
			//System.out.println("Employee ID : ");
			//e.setEmpid(sc.nextInt());
			e.setEmpid(x);
			//System.out.println("Employee Name : ");
			//e.setEmpname(sc.next());
			e.setEmpname("Joerge"+x);			
			e.setSalary(44447.0+x);
			emplist.add(e);
		}
		/*ServletContext cont=getServletContext();//retreive the reference of application level object.
	cont.setAttribute("employeelist", emplist);*/
		HttpSession ses=request.getSession();//it will use existing session if exist in project
		//otherwise will create new session
		System.out.println("Session id "+ses.getId());
		ses.setAttribute("employee1", emplist);




	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
