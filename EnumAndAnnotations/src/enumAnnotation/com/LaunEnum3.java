package enumAnnotation.com;

enum Course
{
	JAVA,JEE,SPRINGBOOT;
	
	int courseId;
	
	Course() //construtor
	{
		System.out.println("constructor");
	}
	
	void setCourseId(int courseId) //setters
	{
		this.courseId=courseId;
	}
	int getCourseId() //getters
	{
		return courseId;
	}
}
public class LaunEnum3 {

	public static void main(String[] args) {
		Course.JAVA.setCourseId(10);
		
		int cid=Course.JAVA.getCourseId();
		
		System.out.println("Course id is: "+cid);

	}

}
