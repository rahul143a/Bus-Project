package com;

import java.util.Scanner;


import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		
		ArrayList<Bus> buses= new ArrayList<Bus>();
		ArrayList<Booking> bookings= new ArrayList<Booking>();
		
		 buses.add(new Bus(1,true,2));
		 buses.add(new Bus(2,false,50));
		 buses.add(new Bus(3,true,40));
		
		int userOpt=1;
		for (Bus b:buses) {
			
			b.displayBusInfo();			
		}
		Scanner scanner=new Scanner(System.in);
	while (userOpt==1) {
		System.out.println("\tEnter The Option\n\t1. Book \n\t2. Exit ");
		userOpt = scanner.nextInt();
		
		if(userOpt==1) {
			Booking booking =new Booking();
			
			if(booking.isAvailable(bookings,buses)) {
				bookings.add(booking);
				System.out.println("your booking is sucessfully");
			}
			else {
				System.out.println("sorry, Bus is fulled, try is another bus");
			}
			
			
		}
	 	else if(userOpt==2) {
	 		System.out.println("Thaks for use this site");
			
		}
	 	else {
	 		System.out.println("you have Entered the incurrect option");
	 	}
		
		
		
	}
		
	}

}
