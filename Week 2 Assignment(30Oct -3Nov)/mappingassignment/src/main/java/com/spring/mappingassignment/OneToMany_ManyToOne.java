package com.spring.mappingassignment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.spring.mappingassignment.entities.Ticket;
import com.spring.mappingassignment.entities.User;

public class OneToMany_ManyToOne {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		Ticket e1 = new Ticket();
		e1.setTicketId(101);
		e1.setTotalAmount(2000);
		e1.setNoOfPassengers(20);

		Ticket e2 = new Ticket();
		e2.setTicketId(102);
		e2.setTotalAmount(3000);
		e2.setNoOfPassengers(25);

		Ticket e3 = new Ticket();
		e3.setTicketId(101);
		e3.setTotalAmount(4000);
		e3.setNoOfPassengers(30);

		User user = new User();

		user.setUserId(1);
		user.setFirstName("uday");
		user.setFirstName("kiran");

		// add all employee to collection set , using addEmployee(employee)

	    user.addTicket(e1);
		user.addTicket(e2);
		user.addTicket(e3);

		session.persist(user);
		//session.delete(new Employee(103,"Ford",50000));
		
		/*Department dept = new Department();

		dept.setDepartmentId(30);
		dept.setDepartmentNam("devlop");
		session.persist(dept);*/
		

		
		
		tx.commit();

	}

}
