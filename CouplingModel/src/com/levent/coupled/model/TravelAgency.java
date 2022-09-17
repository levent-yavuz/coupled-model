package com.levent.coupled.model;

public class TravelAgency implements Travel{

	private Ticket ticket;
	
	@Override
	public void setTicket(Ticket ticket) {
		
		this.ticket = ticket;
	}

	@Override
	public void goTravel() {
		
		ticket.reserveSeat();
		
	}


}
