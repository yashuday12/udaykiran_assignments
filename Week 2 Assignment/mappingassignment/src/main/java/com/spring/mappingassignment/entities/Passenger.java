package com.spring.mappingassignment.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Passenger {

	
	@Id
	private int passengerId;
	
	private String pasengerName;
	@ManyToMany(cascade = CascadeType.ALL)
	
	@JoinTable(name="passenger_ticket", joinColumns = {@JoinColumn(name="passenger_id")} , inverseJoinColumns = {@JoinColumn(name="ticket_id")})
	private  Set<Ticket1>  tickets = new HashSet<Ticket1>();


	

    
	


	public int getPassengerId() {
		return passengerId;
	}





	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}





	public String getPasengerName() {
		return pasengerName;
	}





	public void setPasengerName(String pasengerName) {
		this.pasengerName = pasengerName;
	}





	public Set<Ticket1> getTicket() {
		return tickets;
	}


	


	public void setTicket1(Set<Ticket1> tickets) {
		this.tickets = tickets;
	}	
	
	
	public void addTicket1(Ticket1 ticket) {
		
			
			Set<Ticket1> set =	getTicket();
			
					set.add(ticket);
		
	}
	
	
}
