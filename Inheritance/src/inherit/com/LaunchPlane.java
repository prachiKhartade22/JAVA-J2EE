package inherit.com;

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
		System.out.println("cargoplane is flying at low height");
	}
	
	public void carryGoods()
	{
		System.out.println("cargoplane carries goods");
	}
}

class PassengerPlane extends Plane
{
	public void fly()
	{
		System.out.println("passengerplane flies at medium height");
	}
    public void carryPassenger()
    {
    	System.out.println("Passengerplane carries passengers");
    }
}
public class LaunchPlane {

	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		
		cp.takeOff(); //inherited method
		cp.carryGoods(); //specialized method
	     cp.fly();//overridden method
	     cp.landing();//inherited method
	     
	     pp.takeOff();
	     pp.carryPassenger();
	     pp.fly();
	     pp.landing();

	}

}
