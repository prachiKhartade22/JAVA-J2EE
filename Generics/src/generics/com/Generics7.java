package generics.com;

import java.util.ArrayList;

public class Generics7 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<String>();
    al.add(10);
    al.add("prachi");
    al.add(10.55);
    
    System.out.println(al);
	}

}
/*NOTE:
            ArrayList l=new ArrayList<String>();
            ArrayList l=new ArrayList<Integer>();
            ArrayList l =new Arraylist<Double>(); 
    All are equal at runtime,becoz compiler will remove these generics syntax-
                     ArrayList l=new ArrayList();*/
