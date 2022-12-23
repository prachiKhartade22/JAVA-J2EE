interface ISample1
{
	int a=30;
}
public class TestApp2 implements ISample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(a); //ans=30
/*a=50;
System.out.println(a);
error bcuz in interface varibale is final so uh can modify it later
*/
	}

}
