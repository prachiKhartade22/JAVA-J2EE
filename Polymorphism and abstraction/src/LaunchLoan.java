class Loan
{
	void disp()
	{
		System.out.println("welcome to ineuron");
	}
}
class PersonalLoan extends Loan
{
	void disp()
	{
		System.out.println("personal loan app");
	}
}
public class LaunchLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      PersonalLoan p1=new PersonalLoan();
      p1.disp();
	}

}
