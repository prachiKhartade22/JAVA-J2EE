interface Tester1
{
	void method1();
	void method2();
}

interface Tester2
{
	void method3();
	void method4();
}

class MyClass110 implements Tester1,Tester2
{
	public void method1()
	{
		System.out.println("method1");
	}
	public void method2()
	{
		System.out.println("method2");
	}
	public void method3()
	{
		System.out.println("method3");
	}
	public void method4()
	{
		System.out.println("method4");
	}
}
public class Test2 {

	public static void main(String[] args) {
		MyClass110 obj=new MyClass110();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();

	}

}
