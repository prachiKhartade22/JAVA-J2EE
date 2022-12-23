package inherit.com;

class Parent111
{
	private String name;
	
	Parent111()  //constructor
	{
		System.out.println("paret constructor");
	}
	
	void disp() //method
	{
      System.out.println("Parent"); 
    }
}

class Child111 extends Parent111
{
	/*child111()   //default constructor already present
	{
		//super();
	}*/
	
	void disp2()
	{
		//System.out.println("name: "+name);
		//private members do not participate in inheritance
	}
	
}
public class LaunchCyclic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Child111 c=new Child111();
         c.disp();   
	}

}
