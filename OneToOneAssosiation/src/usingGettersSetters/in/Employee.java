package usingGettersSetters.in;

//target object
public class Employee {

	private String empName;
	private String empId;
	private String empAddr;
	
	//HAS-A relationship
	Account account;

	//getters setters
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpAddr() {
		return empAddr;
	}

	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}   //inject
	
	//display
	void EmployeeDetails()
	{
		System.out.println("Employee details are:       ");
		System.out.println("EMPNAME  :: "+empName);
		System.out.println("EMPID    :: "+empId);
		System.out.println("EMPADDR  :: "+empAddr);
		System.out.println("**************************************************");
		System.out.println("Account details are:        ");
		System.out.println("ACCNAME  :: "+account.getAccName());
		System.out.println("ACCNO    :: "+account.getAccNo());
		System.out.println("ACCTYPE  :: "+account.getAccType());
	}
	
	
}
