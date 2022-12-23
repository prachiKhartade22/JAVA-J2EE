import java.util.*;
import java.util.Map.Entry;
public class LaunchMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Map hm=new HashMap();//loose coupling
		HashMap hm=new HashMap();//tight coupling
		hm.put(10, "Sachin");//entry
		hm.put(7,"msd");
		hm.put(18, "kohli");
		
		System.out.println(hm);
		
		//System.out.println(hm.get(10)+"after this");
		System.out.println("***********************");
		
		
		
		Collection c=hm.values();   //for values
	    Iterator itr=c.iterator();
	    while(itr.hasNext())
	    {
	    	String o=(String) itr.next();
	    	System.out.println(o);
	    }   //do not preserve order of insertion
	    System.out.println("***********************");
	    
	      Set s=hm.keySet();        //for keys
	     Iterator itr2=s.iterator();
	     while(itr2.hasNext())
	     {
//	    	 Integer i=(Integer) itr.next();
//	    	 System.out.println("key: "+i);
	    	 System.out.println(itr2.next());
	     }  
	     System.out.println("***********************");
	     
	     Set es=hm.entrySet();      //set of keys and values
	     Iterator itr3=es.iterator();
	     while(itr3.hasNext())
	     {
	    	 System.out.println(itr3.next());
	    	 Map.Entry data= (Entry) itr3.next();
	    	 System.out.println(data.getKey()+" : "+data.getValue());
	      
	     }
	     System.out.println("***********************");
	     
	     
	}

}
