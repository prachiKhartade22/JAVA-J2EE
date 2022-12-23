package enumAnnotation.com;

@interface CricketPlayer
{
	//@-> it indicates that it is not a interface but it is annotation being created

	String country();
	int runs();
}

class ViratKohli
{
	private int innings;
	private String name;
	
	public int getInnings()
	{
		return innings;
	}
	public void setInnings(int innings)
	{
		this.innings=innings;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}
public class LaunchAnno2 {

	public static void main(String[] args) {
		ViratKohli vk=new ViratKohli();
		vk.setInnings(300);
		vk.setName("vk");
		
		System.out.println("Innings: "+vk.getInnings());
		System.out.println("name: "+vk.getName());

	}

}
