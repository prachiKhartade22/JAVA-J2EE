/* Case 1::
 If 2 interfaces contain a method with same signature and same return type in 
the implementation class only 
 one method implementation is enough.*/

interface Left
{
	public void method1();
}
interface Right
{
	public void method1();
}
class Test33 implements Left,Right
{
	public void method1()
	{
		System.out.println("it works");
	}
}
public class Case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Test33 t=new Test33();
     t.method1();
	}

}
