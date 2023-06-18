package com.nt.beans;

import java.util.Date;

public class Utility {
	
	public void getSysDate()
	{
		System.out.println(new Date());

		System.out.println("In utility class method --> TL for conflicts it was added");
		
		Utility u = new Utility();
		
		u.f1();
	}
	
	public void f1()
	{
		System.out.println("In F1 method");
	}

	
	public void f2()
	{
		System.out.println("In F2 method");
	}
	
	public void f3()
	{
		System.out.println("In F3 method");
	}
	

	public void f5()
	{
		System.out.println("In F5 method");
	}

	public void f4()
	{
		System.out.println("In F4 method");
	}

}


