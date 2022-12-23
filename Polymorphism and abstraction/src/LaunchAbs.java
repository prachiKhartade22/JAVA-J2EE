abstract class Loan1
{
	abstract public void dispInt();
	
	public void welcomeNote()
	{
		System.out.println("welcome to xxx bank");
	}
}
class HomeLoan1 extends Loan1
{
	public void dispInt()
	{
		System.out.println("RI is 12%");
	}
}
class EducationLoan1 extends Loan1
{
	public void dispInt()
	{
		System.out.println("RI is 10%");
	}
}
public class LaunchAbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Loan1 loan=new HomeLoan1();
       loan.welcomeNote();
       loan.dispInt();
       
       Loan1 loan1=new EducationLoan1();
       loan1.dispInt();
       loan1.welcomeNote();
	}

}
