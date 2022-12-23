interface Left0
{
	int x=888;
}
interface Right0
{
	int x=999;
}
public class NamingConflicts implements Left0,Right0 {

	public static void main(String[] args) {
		System.out.println(Left0.x);
		System.out.println(Right0.x);
	}

}
