package inherit.com;
class Demo1
{
	String name="prachi";
	int age=23;
	
	void disp()
	{
		System.out.println("Demo1: "+age +name);
	}
}

class Demo2 extends Demo1
{
	
}
//Demo2 is child class
//Demo1 is parent class
public class LaunchIn1 {

	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.disp();

	}

}
