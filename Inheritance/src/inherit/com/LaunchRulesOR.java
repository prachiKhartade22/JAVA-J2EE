package inherit.com;

class Demo100
{
	void disp()
	{
		System.out.println("demo in parent");
	}
	public void disp2()
	{

    }
	public int add()
	{
		return 10+20;
		
	}
	public int add(int a,int b) //method overload
	{
		return a+b;
	}
}

class Demo78 extends Demo100
{
	public void disp()   //we can increase visibility
	{
		
	}
	/*void disp2  we cannot reduce visibility
	{
		
	}*/
	
	/*public void add()  //return type of child should be same as parent
	{
		//return add;
		//System.out.print("child);
	}*/
/*	public int add(int a,int b)
	{
		return a+b;
	}*/
	
	public int add(int a) //method overload
	{
		return a;
	}
}
public class LaunchRulesOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Demo78 d=new Demo78();
   d.add();
  
   d.add(2,3 );
   d.disp();
   d.disp2();
  
	}

}
