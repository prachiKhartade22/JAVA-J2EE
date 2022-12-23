import java.util.HashMap;
import java.util.WeakHashMap;

class Employee1
{
	private int empid;
	private String name;
	private String emAddr;
	
	public String toString()
	{
		return "hyder";
	}
	public void finalize()
	{
		System.out.println("garbage collector collected");
	}
	
	//getters setters
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmAddr() {
		return emAddr;
	}
	public void setEmAddr(String emAddr) {
		this.emAddr = emAddr;
	}
	public void display()
	{
		System.out.println("name: "+name);
		System.out.println("id: "+empid);
		System.out.println("Adddress: "+emAddr);
	}
	
}
public class LaunchGC2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   Employee1 e=new Employee1();
   e.setEmpid(11);
   e.setName("prachi");
   e.setEmAddr("ytl");
   e.display();
   
   HashMap hm=new HashMap();
   hm.put(e, "hyder");
   System.out.println(hm);
   
   e=null; //elligible for garbage collection
   System.gc(); //call to GC 
   
   Thread.sleep(2000);
   System.out.println(hm);
	}

}
