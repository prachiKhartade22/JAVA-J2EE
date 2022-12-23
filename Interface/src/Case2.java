/*Case2:
 If 2 interfaces contain a method with same name but different arguments in the 
implementation class we have to provide 
 implementation for both methods and these methods acts as a Overload methods*/

interface Leftt
{
	public void method1();
}
interface Rightt
{
	public void method1(int i);
}
class Test34 implements Leftt,Right
{
	public void method1()
	{
		System.out.println("no parameter");
	}
	public void method1(int i)
	{
		System.out.println("one parameter "+i);
	}
}
public class Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Test34 t=new Test34();
     t.method1();
     t.method1(20);
	}

}
