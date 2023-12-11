package com.spring.mappingassignment.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Ticket {
	@Id
	private int ticketId;
	private double totalAmount;
	private int noOfPassengers;
	@ManyToOne
	@JoinColumn(name = "uid") 
	private User user;
	public Ticket() {
		super();
	}
	public Ticket(int ticketId, double totalAmount, int noOfPassengers) {
		super();
		this.ticketId = ticketId;
		this.totalAmount = totalAmount;
		this.noOfPassengers = noOfPassengers;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}	