package comparableAndComparator.com;
import java.util.*;

class Employee implements Comparable
{
	String name;
	int eid;
	
	Employee(String name,int eid)
	{
		this.name=name;
		this.eid=eid;
	}
	@Override
	public String toString()
	{
		return name+"---->"+eid;
	}
	public int compareTo(Object obj)
	{
		int eid1=this.eid;
		Employee e=(Employee)obj;
		int eid2=e.eid;
		
		if(eid1<eid2)
			return -1;
		else if(eid1>eid2)
			return +1;
		else
			return 0;
	}
}
public class Comparator5 {

	public static void main(String[] args) {
		
		Employee e1=new Employee("sachin",10);
		Employee e2=new Employee("ponting",14);
		Employee e3=new Employee("lara",9);
		Employee e4=new Employee("flintoff",17);
		Employee e5=new Employee("anwar",23);
		
		TreeSet ts=new TreeSet();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		System.out.println(ts);
		
		TreeSet t1=new TreeSet(new MyComparator5());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);
	}

}

class MyComparator5 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Employee e1=(Employee) obj1;
		Employee e2=(Employee) obj2;
		
		String s1=e1.name;
		String s2=e2.name;
		
		return s1.compareTo(s2);
	}
}






