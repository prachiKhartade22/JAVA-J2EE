package generics.com;
//communication with non-generic code

import java.util.*;

public class Generics6 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
  al.add("sachin");
  //al.add(10); --->CE
	
   methodOne(al);
//   al.add(10.5);   --->CE
  
  System.out.println(al);
	}
	public static void methodOne(ArrayList al)
	{
		al.add(10);
		al.add("dhoni");
		al.add(true);
	}

}
