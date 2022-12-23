/*What is the need of abstract class? can we create an object of abstract class, Does
it contains constructor?
 => abstract class object cannot be created becoz it is abstract.
 => But constructor is need for constructor to initialize the object.
*/
class Parent
{
	Parent()
	{
		System.out.println("parent constructor");
		System.out.println(this.hashCode());
	}
}
class Child extends Parent
{
	public Child()
	{
		System.out.println("child constructor");
		System.out.println(this.hashCode());
	}
}
public class Address {
    public static void main(String[] args) {
     Child c=new Child();
     System.out.println(c.hashCode());
	}

}
