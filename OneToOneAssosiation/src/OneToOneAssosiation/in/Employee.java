package OneToOneAssosiation.in;

public class Employee {

	private String eid;
	private String ename;
	private String eaddr;
	
	//HAS-A relationship
	Account account;
	
	//constructor injection
	Employee(String eid,String ename,String eaddr,Account account)
	{
		this.eid=eid;
		this.ename=ename;
		this.eaddr=eaddr;
		this.account = account;
	}
	
	//display 
	public void EmployeeDetails()
	{
		System.out.println("Employee details are:: ");
		System.out.println("EMPID   :: "+eid);
		System.out.println("EMPNAME :: "+ename);
		System.out.println("EMPADDR   :: "+eaddr);
		System.out.println("================================");
		System.out.println("Account details are:: ");
		System.out.println("ACCNO   :: "+account.accNo);
		System.out.println("ACCNAME :: "+account.accName);
		System.out.println("ACCTYPE :: "+account.accType);
		
	
	}
	
}
