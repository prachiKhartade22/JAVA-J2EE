//arraylist
import java.util.ArrayList;

public class LaunchALIM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList al4=new ArrayList();
    al4.add(11);
    al4.add(22);
    al4.add(33);
    al4.add(44);
    
    System.out.println(al4);
    
   // boolean res=al4.contains(44); //boolean ans true or false
    //System.out.println(res);
    System.out.println(al4.contains(44));
    
    int index=al4.indexOf(22);
    System.out.println(index);
    
    System.out.println(al4.isEmpty());
    al4.ensureCapacity(10);
    System.out.println(al4.size());
    
    System.out.println("*************");
    al4.trimToSize();
    System.out.println(al4.size());
    System.out.println(al4.getClass());
    
    System.out.println("*************");
    al4.clear();
    System.out.println(al4);
    System.out.println(al4.size());
	}

}
