import java.util.*;

class Employee
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
public class LaunchGC {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   Employee e=new Employee();
   e.setEmpid(11);
   e.setName("prachi");
   e.setEmAddr("ytl");
   e.display();
   
   WeakHashMap hm=new WeakHashMap();
   hm.put(e, "hyder");
   System.out.println(hm);
   
   e=null; //elligible for garbage collection
   System.gc(); //call to GC 
   Thread.sleep(2000);
   System.out.println(hm);
	}

}
