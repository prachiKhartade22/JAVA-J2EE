package comparableAndComparator.com;
import java.util.*;


public class Comparator1 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		
		System.out.println(t);

	}
}	
class MyComparator implements Comparator   
{
	public int compare(Object obj1,Object obj2)
	{
		Integer I1=(Integer) obj1;
		Integer I2=(Integer) obj2;
		
		if(I1<I2)
			return +1;
		else if(I1>I2)
			return -1;
		else
			return 0;    //descending order
		
	
	//	return I1.compareTo(I2);ascending order
	//	return -I1.compareTo(I2); desending order
		//return I2.compareTo(I1);desending order
		//return -I2.compareTo(I1);ascending order
		//return +1;   //order of insertion
		//return -1; desecnding order of insertion
		//return 0; only first element will be inserted
	}
}


