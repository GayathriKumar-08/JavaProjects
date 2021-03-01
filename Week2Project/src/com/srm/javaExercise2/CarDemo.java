package com.srm.javaExercise2;

import java.util.Scanner;

public class CarDemo {
	
	  Scanner sc=new Scanner(System.in);
	  String carname, carcolour;
//	String noofWheels;
	 String noofseats;
   
	static double distance;
    static  double time;
    static double speed;
  
    public void CalculateTime()
    {
    	System.out.println("Enter the car details:");
    	System.out.print("Enter hour: ");
		double hr = sc.nextDouble();
		
		System.out.print("Enter minutes: ");
		double min = sc.nextDouble();
		
		System.out.print("Enter seconds: ");
		double sec = sc.nextDouble();
		
		time = (hr*3600) + (min*60) + sec;
	    System.out.println("Time taken by the car is:"+time);
		//return details;
    }
   public void CalculateSpeed()
   {
	   System.out.println("Enter the distance of the car in meters:");
	     distance = sc.nextDouble();
	    speed=distance/time;
	    speed*=100;
	    //System.out.println("The speed of the car is:"+speed);
   }

	public static void main (String [] args) {
		CarDemo cd=new CarDemo();
	  	Scanner sc1=new Scanner(System.in);
		 System.out.println("Enter the car name:");
      	 String carname=sc1.next();
      	 System.out.println("Enter the car colour:");
      	 String carcolour=sc1.next();
		cd.CalculateTime();
		cd.CalculateSpeed();
		//cd.Service(price);
		 double price;
		 if(speed>=10)
		   {
			   price=1000;
		   }
		   else
		   {
			   price=500;
		   }
		   
		
		 System.out.println("Billing details:");
	  	 System.out.println("car name is:"+carname);
	  	 System.out.println("car name is:"+carcolour);
	     System.out.println("Distance travelled by the car is:"+distance);
	     System.out.println("time taken by the car is:"+time);
	     System.out.println("speed of the car is:"+speed);
	     System.out.println("Total amout to pay:"+price);
	}
	}

	
