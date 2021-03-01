package com.srm.javaExercise2;

public class TestingInhertitance {

		public static void main(String args[])
	{
			
			//System.out.println("Calling!!!!!!");
			FastDelivery fd=new FastDelivery();
			String fast="";
			fd.customerDetails();
			int weight = 0;
			fd.WeightCal(weight);
			fd.fastDel(fast);
			fd.shipping();
			fd.BillCalc();
           
	}

}
