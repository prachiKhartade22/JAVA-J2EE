package inherit.com;

/*final class Vehicle
{
	void disp()
	{
		System.out.println("vehicle");
	}
}
class Car extends Vehicle
{
	void disp()
	{
		System.out.println("vehicle111");
	}
}*/  //final class dont participate in inheritance

class Vehicle
{
	final int i=10; //pariticipate in inheritance
	final void disp()
	{
		System.out.println(i);
		System.out.println("vehicle");
	}
}
class Car extends Vehicle
{
	/*void disp()
	{
		System.out.println(i);
		System.out.println("carrrr");
	}*/ //final method do not participate in inheritance
}
public class LaunchFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Car c=new Car();
   c.disp();
	}

}
