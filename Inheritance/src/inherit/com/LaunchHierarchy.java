package inherit.com;

class Demo111
{
	String name="prachi";
	int age=23;
	
	void display()
	{
      System.out.println("Demo111 "+age +name);  
    }
}

class Demo112 extends Demo111
{
}

class Demo113 extends Demo111
{
}

class Demo114 extends Demo112
{
}

public class LaunchHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Demo114 d=new Demo114();
     d.display();
	}

}
