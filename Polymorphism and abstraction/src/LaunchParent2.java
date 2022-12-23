class Parents
{
	public void cry()
	{
		System.out.println("Parents crying");
	}
}
class Child11 extends Parents
{
	public void cry()
	{
		System.out.println("child1 crying");
	}
	public void eat()
	{
		System.out.println("child1 is eating");
	}
}
class Child12 extends Parents
{
	public void cry()
	{
		System.out.println("child 2 is eating");
	}
	public void eat()
	{
		System.out.println("child2 is eating");
	}
}

public class LaunchParent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Parents p=new Child11();
        p.cry();
        ((Child11)p).eat(); //downcasting
        
        Parents p2=new Child12();
        p2.cry();
        ((Child12) p2).eat(); //donwcasting
	}

}
