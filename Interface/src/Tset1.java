interface Tester
{
	void first();
	void second();
	void third();
}
class MyClass implements Tester
{
	public void first()
	{
		System.out.println("inside first method");
	}
	public void second()
	{
		System.out.println("inside second method");
	}
	public void third()
	{
		System.out.println("inside third method");
	}
}
public class Tset1 {

	public static void main(String[] args) {
		MyClass obj=new MyClass();
		obj.first();
		obj.second();
		obj.third();
	}

}
