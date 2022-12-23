interface Tester11
{
	void method1();
	void method2();
}

interface Tester22 extends Tester11
{
	void method3();
	void method4();
}

class MyClass45 implements Tester22
{
	public void method1()
	{
		System.out.println("aaa");
	}
	public void method2()
	{
		System.out.println("bbb");
	}
	public void method3()
	{
		System.out.println("ccc");
	}
	public void method4()
	{
		System.out.println("ddd");
	}
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MyClass45 m=new MyClass45();
    m.method1();
    m.method2();
    m.method3();
    m.method4();
    
	}

}
