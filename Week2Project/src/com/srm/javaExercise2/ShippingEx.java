package com.srm.javaExercise2;

import java.util.Scanner;

	public class ShippingEx{
	//declaration of variables;

	 int weight;
	 String address;
	 String place;
	 double cost;
	  int noofpackages;
	  String fast;
	  double weightcost;
	  int fdprice;
	  double rate;
	 int noofdays;
	  String productname;
	  String productdes;
	   
	  Scanner sc=new Scanner(System.in);
	   
	 //methods
	public void WeightCal(int weight)
	{
	this.weight=weight;


	System.out.println("Enter the number of packages");
	noofpackages=sc.nextInt();
	System.out.println("Enter the weight of the product");
	weight=sc.nextInt();

	if(weight>=1 && weight<=5)
	{
	   weightcost=20*noofpackages;
	System.out.println("weight cost of the product is:"+weightcost);
	}
	if(weight>5 && weight<=15)
	{
	       weightcost=30*noofpackages;
	System.out.println("Weight cost of the product is:"+weightcost);

	}
	else if(weight>15 && weight<=25 )
	{
	   weightcost=40*noofpackages;
	System.out.println("Weight cost of the product is:"+weightcost);

	}
	else if(weight>25 && weight<=50)
	{
	   weightcost=50*noofpackages;
	System.out.println("Weight cost of the product is:"+weightcost);

	}
	else if(weight>50)
	{
	System.out.println("Over weight cannot be processed"); //(calculation should be added)
	}

	}
	
	
	}



	
	