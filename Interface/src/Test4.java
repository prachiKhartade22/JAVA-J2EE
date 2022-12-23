interface Testerr
{
	void firstt();
	void secondd();
	
}

class ClassTester
{ 
	void thirdd()
	{                                  //dummy
		
	}
	void fourthh()
	{
		            //dummy
	}
	
}
class MyClass78 extends ClassTester implements Testerr
{
	public void firstt()
	{
		
	}
	public void secondd()
	{
		
	}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          MyClass78 obj=new MyClass78();
          obj.firstt();
          obj.secondd();
          obj.thirdd();
          obj.fourthh();
	}

}
