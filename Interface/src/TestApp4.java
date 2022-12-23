abstract class Person
{
	String name;
	int age;
	int height;
	int weight;
	
	Person(String name,int age,int height,int weight)
	{
		//super();
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
}

class Student extends Person
{
	int rollno;
	int marks;
	
	Student(String name,int age,int height,int weight,int rollno,int marks)
	{
		super(name,age,height,weight);
		this.rollno=rollno;
		this.marks=marks;	
	}
	
	void display()
	{
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("height: "+height);
		System.out.println("weight: "+weight);
		System.out.println("rollno: "+rollno);
		System.out.println("marks: "+marks);
	}
}
public class TestApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("PRACHI",23 , 175, 50, 1001, 99);
		
		s.display();
		

	}

}
