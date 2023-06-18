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

}
