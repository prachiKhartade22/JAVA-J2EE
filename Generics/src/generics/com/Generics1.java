package generics.com;
//Generics class:class with type parameter
//create our own generic class
class Gen<T>
{
	T obj;
	Gen(T obj)   //parametrized construtor
	{
		this.obj=obj;
	}
	public void show()
	{
		System.out.println("the type of object is : "+obj.getClass().getName());		
	}
	public T getObject() //getter
	{
		return obj;
	}
	
}
public class Generics1 {

	public static void main(String[] args) {
		Gen<Integer> g1=new Gen<Integer>(10);
		g1.show();
		System.out.println(g1.getObject());
		
		Gen<String> g2=new Gen<String>("ineuron");
		g2.show();
		System.out.println(g2.getObject());
		
		Gen<Double> g3=new Gen<Double>(10.5);
		g3.show();
		System.out.println(g3.getObject());

	}

}
