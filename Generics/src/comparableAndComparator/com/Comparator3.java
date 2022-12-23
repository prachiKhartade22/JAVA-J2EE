package comparableAndComparator.com;
import java.util.*;

class MyComparator3 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
	   String s1=obj1.toString();
	   String s2=obj2.toString();
	   
	   return s1.compareTo(s2);
	}
}
public class Comparator3 {

	public static void main(String[] args) {
		
		TreeSet t=new TreeSet(new MyComparator3());
		t.add(new StringBuffer("a"));
		t.add(new StringBuffer("z"));
		t.add(new StringBuffer("k"));
		t.add(new StringBuffer("l"));
		
		System.out.println(t);

	}

}
