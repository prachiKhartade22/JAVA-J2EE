//linkedlist
import java.util.LinkedList;

public class LaunchLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList ll1=new LinkedList();
     ll1.add(10);
     ll1.add("ineuron");//duplicates allowed
     ll1.add("ineuron");
     ll1.add(20);
     ll1.add('b');
     System.out.println(ll1);
     
     ll1.addFirst("prachi khartade");
     System.out.println(ll1);
     System.out.println("**********************");
     
     ll1.add(3, "ytl");
     System.out.println(ll1);
     System.out.println("**********************");
     
     ll1.addLast("pune");
     System.out.println(ll1);
     System.out.println("**********************");
     
     LinkedList ll2=new LinkedList();
     ll2.add(10);
     ll2.add(20);
     ll2.add(30);
     ll2.add(40);
     ll2.add(30);//duplicates allowed
     System.out.println(ll2);
     System.out.println("**********************");
     
     System.out.println(ll2.getFirst());
     System.out.println(ll2.getLast());
     System.out.println(ll2.indexOf(30));
    System.out.println(ll2.lastIndexOf(30));
    
    //ll2.offerFirst(5);
    //ll2.offerLast(100);
    //System.out.println(ll2);
    
    ll2.addFirst(66);
    ll2.addLast(200);
    System.out.println(ll2);
    
    System.out.println(ll2.peekFirst());//only accessed to shoe do not remove
    System.out.println(ll2);
    
    System.out.println(ll2.pollFirst());//fetched and remove
    System.out.println(ll2);
	}

}
