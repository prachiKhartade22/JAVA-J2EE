package enumAnnotation.com;

enum Result1
{
	PASS,FAIL,NR; //public static
	
	//PASS--->public static final Result PASS=new Result();
	//FAIL--->public static final Result FAIL=new Result();
	//NR----->public static final Result NR=new Result();

	Result1() //constructor
	{
		System.out.println("constructor is called...");
	}
}


public class LaunchEnum2 {

	public static void main(String[] args) {
      Result1 res=Result1.PASS;
      Result1 res2=Result1.FAIL;
      Result1 res3=Result1.NR;
      
      //constructor is called 3 times which indicates object is created 3 times
      System.out.println("**************************");
      System.out.println(res);
      System.out.println(res2);
      System.out.println(res3);
      
      System.out.println("**************************");
      
      Result1 resArr[]=Result1.FAIL.values();
      
      for(Result1 el:resArr)
      {
    	  System.out.println(el.ordinal()+ " "+el.name());
      }
      
      
      

	}

}
