package generics.com;

class Test1<T extends Runnable>
{}
public class Generics4 {

	public static void main(String[] args) {
		Test1<Thread> t1=new Test1<Thread>();

	//	Test<String> t2=new Test<String>();  --->CE
		
//NOTE: If x is an interface then as the type parameter we can pass either x or its 
	//	implementation classes.
		
	}

}
