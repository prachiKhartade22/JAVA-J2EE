package generics.com;
import java.util.*;

public class GenericsTest {

	public static void main(String[] args) {
       
		TreeSet ts = new TreeSet();
        
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("Z"));
        ts.add(new StringBuffer("L"));
        ts.add(new StringBuffer("B"));
        
       System.out.println(ts);//ClassCastException

	}

}
