package constructorDependcy.in;

//dependent course
public class Course {

	String cid;
	String cname;
	int ccost;
	
	
	public Course(String cid, String cname, int ccost) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ccost = ccost;
	}
	
	
}
