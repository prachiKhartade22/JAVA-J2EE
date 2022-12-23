import java.util.*;
import java.util.ArrayList;
public class LaunchImp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList al=new ArrayList();
    al.add(10);
    al.add(20);
    al.add(10.5);
    al.add('c');
    al.add(10.5f);
    al.add("prachi");
    System.out.println(al);
    
    System.out.println("******************");
    
    ArrayList al2=new ArrayList();
    al2.add(10);
    al2.add(20);
    al2.add(30);
    al2.add(40);
    al2.add(50);
    System.out.println(al2);
    System.out.println("******************");
    
    //different ways to access data
    
    //for loop
    for(int i=0;i<al2.size();i++)
    {
    	System.out.println(al2.get(i));
    }
    System.out.println("******************");
    
    //for each loop
    for(Object o:al2)
    {
    	System.out.println(o+ " ");
    }
    System.out.println("******************");
    
    //iterator
    Iterator itr1=al2.iterator();
    while(itr1.hasNext())
    {
    	System.out.println(itr1.next());
    }
    System.out.println("******************");
	}
	
	//reverse
	
   // ListIterator litr=al2.listIterator(al2.size());
    
	
}
