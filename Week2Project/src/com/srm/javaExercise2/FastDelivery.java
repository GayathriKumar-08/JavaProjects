package com.srm.javaExercise2;

import java.util.Scanner;

public class FastDelivery extends ShippingEx implements WeightCalculation {
	//String fast;
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
	  String customername;
	  int custpno;
	  String deliveryaddress;
	  
	public void fastDel(String fast)
	{
	this.fast=fast;
	System.out.println("Fast Delivery?");
	System.out.println("Enter Yes if you want fast delevery process");
	System.out.println("Enter No if you dont want fast delevery process");
	Scanner sc=new Scanner(System.in);
	fast=sc.next();

	if(fast.equals("yes"))
	{
	System.out.println("Enter the number of days for fast delivery process:");
	noofdays=sc.nextInt();
	//fdprice = 0;
	if(noofdays==1) //nested if
	{
	fdprice=250;  //(calculation should be added)
	System.out.println("The amout of fast delivery is:"+fdprice);
	}
	else if(noofdays==2)
	fdprice=200;  //(calculation should be added)
	System.out.println("The amout of fast delivery is:"+fdprice);
	}
	else if(fast.equals("no"))
	{

	System.out.println("You have not choosen the fast develivery option");
	}
	}
	public void customerDetails()
	{
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the customer name");
		 customername=sc1.next();

		System.out.println("Enter the customer phone number");
		 custpno=sc1.nextInt();

		System.out.println("Enter the delivery address");
		 deliveryaddress=sc1.next();
	}

		//ShippingEx ship=new ShippingEx();

		//ship.WeightCal(noofpackages);
		//ship.fastDel(fast);
		//ship.shipping();

	public void BillCalc()
	{
		double totalshippingcost= noofpackages+weightcost+fdprice+rate;
		System.out.println(totalshippingcost);

		    System.out.println("Shipping Bill Details!!!!");
		    System.out.println("---------------------------------");
		  
			System.out.println("Customer name: "+customername);
		    System.out.println("Customer phone number: "+custpno);
		    System.out.println("Delivery address: "+deliveryaddress);
		    System.out.println("No of packages: "+noofpackages);
		    System.out.println("Weight Cost: "+weightcost);
		    System.out.println("fast delivery: "+fdprice);
		    System.out.println("Product Name: "+productname);
		    System.out.println("Product Description: "+productdes);
		    System.out.println("Place: "+place);
		    System.out.println("Shipping charges: "+rate);
		    System.out.println("Total shipping cost: "+totalshippingcost);
		}
	
     public void shipping()
	 {
	System.out.println("Enter the product Name ");
	productname=sc.next();

	System.out.println("Enter the productDescription ");
	productdes=sc.next();

	System.out.println("Enter destination place: ");
	place=sc.next();

	switch(place) {
	case "america":
	rate=700;
	break;
	case "north america":
	rate=900;
	break;
	case "europe":
	rate=1500;
	break;
	case "china":
	rate=2000;
	break;
	default:
	rate=0;
	System.out.println("Service Not Available"); //(calculation should be added)
	}
	}

}
	




