package settersDepenencyInjection.in;

import java.util.*;
public class TestApp {

	public static void main(String[] args) {
		
		Branch branch=new Branch();
		branch.setBid("IN100");
		branch.setBname("Pune");
		
		Student s1=new Student();
		s1.setSid("10");
		s1.setSname("prachi");
		s1.setSaddr("pune");
		s1.setBranch(branch);
		
		Student s2=new Student();
		s2.setSid("11");
		s2.setSname("rahul");
		s2.setSaddr("pune");
		s2.setBranch(branch);
		
		Student s3=new Student();
		s3.setSid("12");
		s3.setSname("rohit");
		s3.setSaddr("banglore");
		s3.setBranch(branch);
		
		System.out.println("Student details are :: ");
		System.out.println("ID    :: " + s1.getSid());
		System.out.println("NAME  :: " + s1.getSname());
		System.out.println("ADDR  :: " + s1.getSaddr());
		System.out.println("BID   :: " + s1.getBranch().getBid());
		System.out.println("BNAME :: " + s1.getBranch().getBname());
		System.out.println("========================================");

		System.out.println("ID  :: " + s2.getSid());
		System.out.println("NAME:: " + s2.getSname());
		System.out.println("ADDR:: " + s2.getSaddr());
		System.out.println("BID   :: " + s2.getBranch().getBid());
		System.out.println("BNAME :: " + s2.getBranch().getBname());
		System.out.println("========================================");

		System.out.println("ID  :: " + s3.getSid());
		System.out.println("NAME:: " + s3.getSname());
		System.out.println("ADDR:: " + s3.getSaddr());
		System.out.println("BID   :: " + s3.getBranch().getBid());
		System.out.println("BNAME :: " + s3.getBranch().getBname());

	}

}
