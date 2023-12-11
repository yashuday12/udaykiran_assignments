package com.spring.mappingassignment.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
    @Id
	private int userId;
	private String firstName;
	private String password;
	private Set<Ticket> tickets=new HashSet<Ticket>();
	public User() {
		super();
	}
	public User(int userId, String firstName, String password,Set<Ticket> tickets) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.password = password;
		this.tickets=tickets;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Ticket> getTickets() {
		return tickets;
	}
	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}
	public Set<Ticket> getEmployees() {
		return tickets;
	}
	
	public void addTicket(Ticket ticket) {

				ticket.setUser(this); // in main() dept.addEmployee(e1);

				Set<Ticket> set = getTickets();

				set.add(ticket);

			}
	
	
	
}
