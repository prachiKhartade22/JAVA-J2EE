class Plane
{
	public void takeOff()
	{
		System.out.println("plane is taking off");
	}
	public void fly()
	{
		System.out.println("plane is flying");
	}
	public void landing()
	{
		System.out.println("plane is landing");
	}
}
class CargoPlane extends Plane
{
	public void fly()
	{
		System.out.println("cargoplane is flying");
	}
}
class PassengerPlane extends Plane
{
	public void fly()
	{
		System.out.println("passengerplane is flying");
	}
}
class FighterPlane extends Plane
{
	public void fly()
	{
		System.out.println("fighterplane is flying");
	}
}
class Airport
{
	public void permit(Plane plane)
	{
		plane.takeOff();
		plane.landing();
		plane.fly();
	}
}
public class LaunchPlane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CargoPlane cp=new CargoPlane();
     PassengerPlane pp=new PassengerPlane();
     FighterPlane fg=new FighterPlane();
     
     Airport a=new Airport();
     a.permit(cp);
     a.permit(pp);
     a.permit(fg);
	}

}
