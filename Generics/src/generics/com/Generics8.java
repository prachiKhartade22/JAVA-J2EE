package generics.com;
import java.util.*;
//Comparable interface

public class Generics8 {

	public static void main(String[] args) {
		//sorting of objects will happen based in default natural sorting order
		TreeSet ts=new TreeSet();
		ts.add("a");
		ts.add("z");
		ts.add("l");
		ts.add("b");
		//ts.add((null); -->NullPointerException
		//ts.add(10);-->ClassCastException
		
		
		
		System.out.println(ts);
		

	}

}
