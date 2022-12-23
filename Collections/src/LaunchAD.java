//array deque

import java.util.ArrayDeque;

public class LaunchAD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayDeque ad=new ArrayDeque();
  ad.add(10);
  ad.add(20);
  ad.add(30);
  ad.add(30); //duplicates are allowed
  
  System.out.println(ad);
  
  ad.addFirst(5);
  ad.addLast(35);
  
  Object o = ad.getFirst(); //fetched and remove first element
  System.out.println(o);
  
  Object o1 = ad.getLast();
  System.out.println(o1);
  
  ad.clear();
  
  System.out.println(ad);
	}

}
