package enumAnnotation.com;

 //enums can be define outside the class independently
enum Compass
{
	NORTH,SOUTH,EAST,WEST;
} 


public class LaunchEnum1 {

	/*enum Gender
	{
		MALE,FEMALE,OTHERS;
	}*/ //enums can be define inside a class
	public static void main(String[] args) {
		
		Compass c1=Compass.NORTH;
		Compass c2=Compass.SOUTH;
		Compass c3=Compass.EAST;
		Compass c4=Compass.WEST;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}

}
