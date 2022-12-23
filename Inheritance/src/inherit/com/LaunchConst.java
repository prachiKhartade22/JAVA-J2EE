package inherit.com;

class Parentt
{
	int a,b;
	
	
	Parentt()   //constructor
	{
		a=10;
		b=20;
		System.out.println("parent const");
	}
	
	Parentt(int a,int b) //parametrized const
	{
		this.a=a;
		this.b=b;
		System.out.println("parent para const");
	}
}

class Childd extends Parentt
{
	int x,y;
	
	Childd()
	{
		this(111,222);
		x=100;
		y=200;
	}
	
	Childd(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}
public class LaunchConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Childd ch=new Childd();
     ch.display();
     Childd ch1=new Childd(1000,2000);
     ch1.display();
	}

}
