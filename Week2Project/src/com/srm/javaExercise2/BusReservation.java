package com.srm.javaExercise2;

import java.util.Scanner;

public class BusReservation implements UserLogin,Booking{

	Scanner sc=new Scanner(System.in);
  
	 static  String name,password;
	 
	 static int noofseats;
	 static String FromPlace;
	 static String ToPlace;
	 static String Onwarddate;
	 static String ReturnDate;
	

     public void userlogin(String name, String password)
     {
    	 this.name=name;
         this.password=password;
         
         System.out.println("Enter your details");
         
         System.out.println("Enter ur name:");
         name=sc.nextLine();
         System.out.println("Enter ur Password:");
         password=sc.nextLine();
         System.out.println("Name: "+name+" Password:"+password);
    	 
     }
     public void BookingWindow(int noofseats,String FromPlace,String ToPlace,String Onwarddate,String ReturnDate)
     { 
    	 this.noofseats=noofseats;
    	 this.FromPlace=FromPlace;
    	 this.ToPlace=ToPlace;
    	 this.Onwarddate=Onwarddate;
    	 this.ReturnDate=ReturnDate;
    	 
    	 
    	 System.out.println("Enter number of seats:");
    	  noofseats=sc.nextInt();
    	  
    	  System.out.println("Enter From Place:");
    	  FromPlace=sc.next();
    	  
    	  System.out.println("Enter To Place:");
    	  ToPlace=sc.next();
    	  
    	  System.out.println("Enter the onward date:");
    	  Onwarddate=sc.next();
    	  
    	  System.out.println("Enter the return date Place:");
    	  ReturnDate=sc.next();
    	  
    	  System.out.println("check the details below!!!!");
    	  
    	  System.out.println("Noofseats:"+noofseats);
    	  System.out.println("FromPlace::"+FromPlace);
    	  System.out.println("ToPlace::"+ToPlace);
    	  System.out.println("Onwarddate::"+Onwarddate);
    	  System.out.println("ReturnDate::"+ReturnDate);
    			  
    	
    	  int price=1500;
    	  int TotalPrice=noofseats*price;
    	 System.out.println("Your Total Price is:"+TotalPrice);
     }
   //  public void exit();
 public static void main(String args[])
 {
	//Scanner sc=new Scanner(System.in);
	 // System.out.println("Enter the process");
	// int i=sc.nextInt();
	 BusReservation br=new BusReservation();
	  br.userlogin(name, password);
     System.out.println("Logined Successfully!!!!");  
     System.out.println("Book Your Ticket");
	 br. BookingWindow(noofseats,FromPlace,ToPlace,Onwarddate,ReturnDate);
	  
	
	 
 }
}
