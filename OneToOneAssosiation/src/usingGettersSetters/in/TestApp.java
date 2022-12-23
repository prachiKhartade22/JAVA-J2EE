package usingGettersSetters.in;

public class TestApp {

	public static void main(String[] args) {
		
		Account account=new Account();
		account.setAccName("Prachi");
		account.setAccNo("PR1002");
		account.setAccType("Savings");
		
		Employee em=new Employee();
		em.setEmpName("Prachi");
		em.setEmpId("IDPR5678");
		em.setEmpAddr("Yavatmal");
		em.setAccount(account); //inject
		
		em.EmployeeDetails();

	}

}
