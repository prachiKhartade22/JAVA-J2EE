package constructorDependcy.in;

public class TestApp {

	public static void main(String[] args) {
		
		Course c1=new Course("a11","java",100);
		Course c2=new Course("b11","c++",200);
		Course c3=new Course("c11","python",300);

		Course[] course=new Course[3];
		course[0]=c1;
		course[1]=c2;
		course[3]=c2;
		
		Student s1=new Student("IN01","prachi","ytl",course);
		Student s2=new Student("IN02","vedha","nagpur",course);
		Student s3=new Student("IN03",",medha","pune",course);
	
		s1.getStudentDetails();
		s2.getStudentDetails();
		s3.getStudentDetails();
	}

}
