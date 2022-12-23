import java.util.*;
import java.util.Map.Entry;
class Information
{
	private String name;
	private int age;
	private String fathername;
	private String city;
	
	public Information(String name,int age,String fathername,String city)
	{
		this.name=name;
		this.age=age;
		this.fathername=fathername;
		this.city=city;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getFathername() {
		return fathername;
	}

	public String getCity() {
		return city;
	}
	
	@Override
	public String toString()
	{
		return name+" "+age+" "+fathername+" "+city;
	}
}
public class LaunchPassport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Information info1=new Information("rohan sharma",18,"santosh","mumbai");
    Information info2=new Information("rahul gugnani",22,"vihan","vani");
    Information info3=new Information("prachi khartde",23,"yuvraj","yavatmal");
    
    HashMap hm=new HashMap();
    hm.put(111, info1);
    hm.put(222,info2);
    hm.put(333,info3);
    
    System.out.println("welcome to passport details app");
    Scanner scan=new Scanner(System.in);
    System.out.println("please enter the passport number");
    Integer k=scan.nextInt();
    
    boolean flag=false;
    
    Set set=hm.entrySet();
    Iterator itr=set.iterator();
    while(itr.hasNext())
    {
    	Map.Entry passport=(Entry) itr.next();
      //System.out.println("Passport number: "+passport.getKey()+" Info: "+passport.getValue());
  //  System.out.println(itr.next());
      int key=(int) passport.getKey();
      if(k==key)
      {
    	  System.out.println(" :Info : "+passport.getValue());
    	  flag=true;
      }
    }
      if(flag==false)
      {
    	  System.out.println("passport number not found");
      }
	}

}
