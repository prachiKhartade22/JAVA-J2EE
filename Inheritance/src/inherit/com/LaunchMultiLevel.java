package inherit.com;

class Demo11 //extends object
{
	//object properties and methods
	String name="prachi";
	int age=23;
	
	void disp()
	{
		System.out.println("demo1: "+age +name);
	}
}

class Demo12 extends Demo11
{
	
}
class Demo13 extends Demo12
{
	}
public class LaunchMultiLevel {

	public static void main(String[] args) {
		Demo13 d=new Demo13();
		d.disp();

	}

}
