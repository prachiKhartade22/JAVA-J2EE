interface ISample
{
	int a=10;
	//by default public static final
}
public class TestApp implements ISample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=20; //local variable
    System.out.print(a);
	}

}

//20 is printed even though in interface it is final bcuz scope of local variable is greater than static final 