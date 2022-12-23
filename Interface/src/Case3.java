/*case3::
 If two interfaces contains a method with same signature but different return 
types then it is not possible to implement 
 both interface simultaneously.*/

interface Left1
{
	public void method1();
}
interface Right1
{
	public int method1(int i);
}
class Test35 implements Left1//,Right1
{
	public void method1()
	{
		System.out.println("no parameter");
	}
/*	public int method1()
	{
		System.out.println("one parameter ");
		
	}*/
}
public class Case3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Test35 t=new Test35();
     t.method1();
     t.method1();
	}

}
