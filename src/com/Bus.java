package com;

public class Bus {
   private	int busNo;
   private boolean ac;
   private int capacity;
	
	
	public Bus(int busNo, boolean ac, int capacity) {

		this.busNo = busNo;
		this.ac = ac;
		this.capacity = capacity;
	}


	public int getBusNo() { //accessor method
		return busNo;
	}


	public void setBusNo(int busNo) { //mutator methods
		this.busNo = busNo;
	}


	public boolean isAc() {
		return ac;
	}


	public void setAc(boolean ac) {
		this.ac = ac;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	void displayBusInfo(){
		System.out.println("Bus no : "+ busNo+" Ac : "+ ac+" Total Capacity : "+ capacity);
		
	}
	}
