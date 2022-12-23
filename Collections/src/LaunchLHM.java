import java.util.*;
public class LaunchLHM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(10, "Sachin");//Entry
		hm.put(7, "MSD");
		hm.put(18, "Kohli");
		System.out.println("using hashmap");
		System.out.println(hm);//does not preserve oreder of insertion
		
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put(10,"sachin");
		lhm.put(7,"msd");
		lhm.put(18,"kohli");
		System.out.println("using linkedhashmap");
		System.out.println(lhm);//preserve order of insertion
	}

}
