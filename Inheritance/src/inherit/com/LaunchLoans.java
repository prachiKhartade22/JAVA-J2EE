package inherit.com;

class Interest
{
	
}
class InterestPersonalLoan extends Interest
{
	
}

class Loans
{
	public Interest interest() //object return type
	{
		Interest it=new Interest();
		return it;
	}
}
class PersonalLoan extends Loans
{
	public InterestPersonalLoan interest()
	{
		InterestPersonalLoan ipl=new InterestPersonalLoan();
		return ipl;
	}
}
public class LaunchLoans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PersonalLoan p=new PersonalLoan();
     p.interest();
	}

}
