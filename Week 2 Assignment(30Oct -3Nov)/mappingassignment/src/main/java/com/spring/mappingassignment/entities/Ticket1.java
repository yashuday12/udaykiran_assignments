package com.spring.mappingassignment.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
public class Ticket1 {
	
	
	@Id
	private  int ticketId;
	private double price;
	
	@ManyToMany(mappedBy = "products", fetch = FetchType.LAZY)
	Set<Passenger>  passengers  = new  HashSet<Passenger>();

	public int getTicketId() {
		return ticketId;
	}


	public double getPrice() {
		return price;
	}

	public Set<Passenger> getPassengers() {
		return passengers;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	
	
	
	
	

}
