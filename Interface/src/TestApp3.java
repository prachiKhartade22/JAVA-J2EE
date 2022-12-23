interface X
{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
	
}
abstract class AdapterX implements X
{
	public void m1() {}
	public void m2() {}
	public void m3() {}
	public void m4() {}
	public void m5() {}

}
public class TestApp3  extends AdapterX{

	public static void main(String[] args) {
		
		/*public void m3()
		{
			System.out.println("I am from m3()");
		}*/

	}

}
