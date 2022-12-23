class Parentt
{
	Parentt()
	{
		System.out.println("parentt constructor");	
	}
}
class Child1 extends Parentt
{
	public Child1()
	{
		System.out.println("child1 constructor");	
	}
}
class Child2 extends Child1
{
	public Child2()
	{
		System.out.println("child2 construtor");
	}
}
public class Demo {
	public static void main(String[] args) {
     Child2 c=new Child2();  
	}
}
