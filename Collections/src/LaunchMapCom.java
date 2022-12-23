import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Student1
{
	private String name;
	private int age;
	private String city;
	
	public Student1(String name,int age,String city)
	{
		this.name=name;
		this.age=age;
		this.city=city;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getCity()
	{
		return city;
	}
	
	@Override
	public String toString()
	{
		return name+" "+age+" "+city;
		
	}
}
public class LaunchMapCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student1 s1=new Student1("rohan",23,"mumbai");
      Student1 s2=new Student1("rahul",24,"vani");
      Student1 s3=new Student1("prachi",22,"yavatmal");
      
      HashMap hm=new HashMap();
      hm.put(1,s1);
      hm.put(2,s2);
      hm.put(3,s3);
      
      System.out.println(hm);
      
      //view
      //entryset
      
      //for values
      Collection c=hm.values();
      Iterator itr=c.iterator();
      while(itr.hasNext())
      {
    	  System.out.println("values: "+itr.next());
      }
      System.out.println("**************************");
      
      //for keys
      Set s=hm.keySet();
      Iterator itr2=s.iterator();
      while(itr2.hasNext())
      {
    	  System.out.println("keys: "+itr2.next());
      }
      System.out.println("**************************");
      
      //for key value set
      Set bothdata=hm.entrySet();
      Iterator itr3=bothdata.iterator();
      while(itr3.hasNext())
      {
    	  Map.Entry data =(Entry) itr3.next();
    	  System.out.println(data.getKey()+" "+data.getValue());
    	 // System.out.println("both data: "+itr3.next());
      }
	}

}
