package constructorDependency.in;

//target object
public class Student {
	
	   private String sid;
	   private String sname;
	   private String saddr;
	   
	   //has-a relationship
	   Branch branch;

	   
	   //constructor injection
	public Student(String sid, String sname, String saddr, Branch branch) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.branch = branch;
	}
	
	public void getDetails()
	{
		System.out.println("Student details:             ");
		System.out.println("Sid       :: "+sid);
		System.out.println("Sname     :: "+sname);
		System.out.println("Saddr     :: "+saddr);
		System.out.println("bid       :: "+branch.bid);
		System.out.println("bname       :: "+branch.bname);
		   
	}
	
	   
}
