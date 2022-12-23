package comparableAndComparator.com;
//Comparable contains compareTo(T)
import java.util.*;
public class CaC1 {

	public static void main(String[] args) {
		
   System.out.println("A".compareTo("Z"));		
   System.out.println("Z".compareTo("K"));
   System.out.println("Z".compareTo("Z"));
   System.out.println("Z".compareTo("null"));
   //Ascending order naturally
   
   TreeSet t=new TreeSet();
   t.add("K");
   t.add("Z");
   t.add("A");
   t.add("A"); //call to compare method
   
   System.out.println(t); //ascending order
	}

}
