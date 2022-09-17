package com.levent.coupled.model;

public class Plane implements Ticket {

	@Override
	public void reserveSeat() {
		
		System.out.println("The Seat of Plane is Reserved.. ");
	}
}
