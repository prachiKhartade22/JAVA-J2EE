package inherit.com;

class Loan
{
	void disp()
	{
		System.out.println("welcome to ineuron bank");
	}
}
class PersonalLoan1 extends Loan
{
	void disp()
	{
		System.out.println("personal loan app");
	}
}
public class LaunchLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PersonalLoan1 pl=new PersonalLoan1();
     pl.disp();
	}

}
