package primitiveValueInjection.com;

public class Student {

	//instance variables
	private String name;
	private int age;
	private int id;
	
	Student(String name,int age,int id)
	{
		this.name=name;
		this.age=age;
		this.id=id;
	}
	public String getName()
	{
		return name;
		
	}
	public int getAge()
	{
		return age;
	}
	public int getId()
	{
		return id;
	}
	
	@Override
	public String toString()
	{
		return "name: "+name+" age: "+age+" id: "+id;
	}

}
