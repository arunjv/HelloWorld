package com.arunjv;

public class SingleMain {
	
	public static void main(String[] args)
	{
		Single s1=Single.getInstance();
		Single s2=Single.getInstance();
		Single s3=Single.getInstance();
		Single s4=Single.getInstance();
		s1.addVisitor();
		s2.addVisitor();
		s3.addVisitor();
		s4.addVisitor();
	}
}


class Single
{
	static Single single;
	static double visitor;
	private Single()
	{
		System.out.println("Instance created");
	}
	public static synchronized Single getInstance()
	{
		if(single==null)
		{
			single=new Single();
		}
		return single;
	}
	public void addVisitor()
	{
		System.out.println(visitor++);
	}
	
}
