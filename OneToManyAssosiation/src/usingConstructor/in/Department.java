package usingConstructor.in;

//target object
public class Department {

	private String did;
	private String dname;
	
	//HAS-A relationship
	private Employee[] emps; //many employees
	
	//constructor injection
	public Department(String did,String dname,Employee[] emps)
	{
		this.did=did;
		this.dname=dname;
		this.emps=emps;
	}
	
	public void getDepartmentDetails()
	{
		System.out.println("Department details::     ");
		System.out.println("Department ID      ::"+did);
		System.out.println("Department name    ::"+dname);
		System.out.println();
		System.out.println("=============================");
		
		System.out.println("Employee details::     ");
		for(Employee employee:emps)
		{
			System.out.println("Employee ID      ::"+employee.eid);
			System.out.println("Employee name    ::"+employee.ename);
			System.out.println("Employee address ::"+employee.eaddr);
			System.out.println();
		}
		
	}
	
}
