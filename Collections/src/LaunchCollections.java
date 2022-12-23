import java.util.*;
public class LaunchCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeSet ts=new TreeSet(); //minheap ds
      ts.add(100);
      ts.add(50);
      ts.add(150);
      ts.add(25);
      ts.add(75);
      ts.add(125);
      ts.add(175);
      
      System.out.println(ts);
      System.out.println("******************");
      
      ArrayList al=new ArrayList();
      al.add(100);
      al.add(50);
      al.add(150);
      al.add(125);
      al.add(75);
      al.add(125);
      al.add(175);
      System.out.println(al);
      System.out.println("******************");
      
      //collection vs collections
      
      Collections.sort(al);
      System.out.println(al);
      System.out.println("******************");
      
      ArrayList<String> al2=new ArrayList<String>();
      al2.add("prachi");
     // al2.add(23);  error
      al2.add("ineuron");
      al2.add("abc");
     // al2.add(56576878); error
      
      Collections.sort(al2);
      System.out.println(al2);
      System.out.println("******************");
      
      ArrayList<Integer> al3=new ArrayList<Integer>();
      al3.add(12345);
      al3.add(200);
      al3.add(12);
      //al3.add("vhhda"); error
      Collections.sort(al3);
      System.out.println(al3);
      
      System.out.println("******************");
      
      ArrayList al4=new ArrayList();
      al4.add(10);
      al4.add(20);
      al4.add(30);
      al4.add(40);
      al4.add(50);
      al4.add(40);
      System.out.println(al4);
      int index=Collections.binarySearch(al4, 40);
	   System.out.println("Index is: "+index);
	   System.out.println("******************");
	   
	   Collections.shuffle(al4);
	   System.out.println(al4);
	   
	   System.out.println(Collections.frequency(al4, 40));
	}

}
