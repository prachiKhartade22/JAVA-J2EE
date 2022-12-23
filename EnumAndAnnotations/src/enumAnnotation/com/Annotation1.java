package enumAnnotation.com;

@FunctionalInterface  //annotation
interface Trial
{
	void Num(); //public abstract
}

class JavaLearning
{
	
	public void disp1()
	{
		System.out.println("parent disp method");
	}
}

class Focus extends JavaLearning
{
	@Override   //annotation
	public void disp1()
	{
		System.out.println("override the parent disp method successfully");
	}
}
public class Annotation1 {

	public static void main(String[] args) {
		Trial t=()->   //lambda expression
		{
			System.out.println("annotation is imp");
		};

	}

}
