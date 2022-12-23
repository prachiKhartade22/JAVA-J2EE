import java.util.*;

class Ineuron
{
	int i;
	public Ineuron(int i)
	{
		this.i=i;
	}
	
	public String toString()
	{
		return i+ " ";
	}
}
public class LaunchHT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Hashtable ht=new Hashtable();
      ht.put(11, "hyder");
      ht.put(12, "nitin");
      ht.put(13, "prachi");
      
      System.out.println(ht);
      System.out.println("******************************");
      
      Hashtable ht2=new Hashtable();
      ht2.put(new Ineuron(11), "hyder");
      ht2.put(new Ineuron(12), "nitin");
      ht2.put(new Ineuron(13), "prachi");
      System.out.println(ht2);
	}

}
