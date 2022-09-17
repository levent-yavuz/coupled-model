package com.levent.coupled.model;

public class TravelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Travel travel = new TravelAgency();
		Plane plane = new Plane();
		
		travel.setTicket(plane);
		
		travel.goTravel();
	}

}
