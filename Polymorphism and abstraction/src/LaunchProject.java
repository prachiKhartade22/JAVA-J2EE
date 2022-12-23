import java.util.Scanner;
abstract class Shapes
{
	float area;
	abstract public void input();
	abstract public void compute();
	 public void disp()
	{
		System.out.println("AREA     :"+area);
	}
}
class Rectangle extends Shapes
{
	float length;
	float breadth;
	
	public void input() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the length of rectangle");
		length=sc.nextFloat();
		System.out.println("please enter the breadth of rectangle");
		breadth=sc.nextFloat();
	}
	public void compute()
	{
		area=length*breadth;
	}
}
class Square extends Shapes
{
	float length;
	
	
	public void input() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the length of square");
		length=sc.nextFloat();
	}
	public void compute()
	{
		area=length*length;
	}
}
class Circle extends Shapes
{
	float radius;
	final float pi=3.14f;
	
	public void input() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the radius of circle");
		radius=sc.nextFloat();
	}
	public void compute()
	{
		area=pi*radius*radius;
	}
}
class Geometry
{
	void permit(Shapes s)
	{
		s.input();
		s.compute();
		s.disp();
	}
}
public class LaunchProject {

	public static void main(String[] args) {

       Rectangle r=new Rectangle();
       Square sq=new Square();
       Circle c=new Circle();
       
       Geometry g=new Geometry();
       g.permit(r);
       g.permit(sq);
       g.permit(c);
       
	}

}
