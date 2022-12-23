package comparableAndComparator.com;
import java.util.*;

public class Comparator4 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new MyComparator4());
		ts.add("A");
		ts.add(new StringBuffer("ABC"));
		ts.add(new StringBuffer("AA"));
		ts.add("XX");
		ts.add("ABCE");
		ts.add("A");
		
		System.out.println(ts);

	}

}

class MyComparator4 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		
		int i1=s1.length();
		int i2=s2.length();
		
		if(i1<i2)
			return -1;
		else if(i1>i2)
			return +1;
		else
			return s1.compareTo(s2);
	}
}
