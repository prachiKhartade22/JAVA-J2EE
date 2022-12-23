package generics.com;
//Bounded types

class Test<T extends Number>
{}
public class Generics3 {

	public static void main(String[] args) {
		Test<Integer> t1=new Test<Integer>();
	//	Test<String> t2=new Test<String>();  ---> CE

		
		//NOTE:If x is a class then as the type parameter we can pass either x or its child 
		//classes.

	}

}
