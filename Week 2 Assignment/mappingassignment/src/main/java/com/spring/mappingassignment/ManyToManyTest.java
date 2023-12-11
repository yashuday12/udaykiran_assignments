package com.spring.mappingassignment;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.spring.mappingassignment.entities.Passenger;
import com.spring.mappingassignment.entities.Ticket1;


public class ManyToManyTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session1 = sessionFactory.openSession();

		Transaction tx = session1.beginTransaction();

		Ticket1 t1 = new Ticket1();
		t1.setTicketId(10);
		t1.setPrice(50000);

		Ticket1 t2 = new Ticket1();
		t2.setTicketId(20);
		t2.setPrice(500000);
		Ticket1 t3 = new Ticket1();
		t3.setTicketId(30);
		t3.setPrice(600000);


		
		  Passenger p1 = new Passenger(); p1.setPassengerId(50);
		  p1.setPasengerName("uday");
		  
		  p1.addTicket1(t1); p1.addTicket1(t2);
		 
		Passenger p2 = new Passenger();

		p2.setPassengerId(50);
		  p2.setPasengerName("uday");
		  
		  p2.addTicket1(t1); p2.addTicket1(t2);
		
			session1.persist(p1);
			session1.persist(p2);
			tx.commit();
			
			sessionFactory.close();
		

	}

}
