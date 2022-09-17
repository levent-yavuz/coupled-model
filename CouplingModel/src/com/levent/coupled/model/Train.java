package com.levent.coupled.model;

public class Train implements Ticket{

	@Override
	public void reserveSeat() {
		
		System.out.println("The Seat of Train is Reserved.. ");
	}

}
