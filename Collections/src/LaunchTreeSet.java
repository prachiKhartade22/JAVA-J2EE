import java.util.*;
public class LaunchTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeSet ad=new TreeSet();
     ad.add(10);
     ad.add(20);
     ad.add(30);
     ad.add(40);
     ad.add(50);
     Iterator it=ad.iterator();
     
     while(it.hasNext()==true)
     {
    	 Integer i=(Integer)it.next();
    	 System.out.println("array de "+i);
     }
     
     System.out.println("added linked list");
     LinkedList li=new LinkedList();
     li.addAll(ad);
     System.out.println(li);
     
     ListIterator litr2=li.listIterator(li.size());
     System.out.println("accessing treeset data in reverse");
     while(litr2.hasPrevious())
     {
    	 System.out.println(litr2.previous());
     }

     
     //linkedlist,arraydeque,treeset
     
    LinkedList ll2=new LinkedList();
    ll2.add(100);
    ll2.add(200);
    ll2.add(300);
    ll2.add(400);
    ll2.add(500);
    System.out.println(ll2);
    
    //descending iterator
    Iterator ditr=ll2.descendingIterator();
    while(ditr.hasNext())
    {
    	System.out.println(ditr.next());
    }

  }

}
