package OneToOneAssosiation.in;

public class TestApp {

	public static void main(String[] args) {
	
		Account account=new Account("ABC123","Sachin","Savings");

		//constructor injection
		Employee em=new Employee("IND10","Sachin","MI",account);
		em.EmployeeDetails();
	}

}
