package comparableAndComparator.com;
import java.util.*;

class MyComparator1 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
	    String s2=(String) obj2;
		
//		String s1=(String) obj1;
//		String s2=(String) obj2;
	    
	    return -s1.compareTo(s2);
	   // return s2.compareTo(s1);
	}
}
public class Comparator2 {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet(new MyComparator1());
		ts.add("sachin");
		ts.add("ponting");
		ts.add("sangkara");
		ts.add("fleming");
		ts.add("lara");
		
		System.out.println(ts);

	}

}
