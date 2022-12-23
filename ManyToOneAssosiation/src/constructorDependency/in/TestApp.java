package constructorDependency.in;

public class TestApp {

	public static void main(String[] args) {
		
		Branch branch=new Branch("Ind200","pune");
		
		Student s1=new Student("PR100","prachi","yavtmal",branch);
		Student s2=new Student("SK200","swati","arni",branch);
		Student s3=new Student("AK300","akshay","nagpur",branch);
		
		s1.getDetails();
		s2.getDetails();
		s3.getDetails();

	}

}
