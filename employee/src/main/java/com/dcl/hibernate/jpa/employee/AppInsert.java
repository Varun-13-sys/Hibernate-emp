package com.dcl.hibernate.jpa.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppInsert {
	public static void main(String[] args) {
//		Employee emp = new Employee();
//		emp.setId(101);
//		emp.setTitle("Tom");
//		emp.setEmail("tom@gmail.com");
//		emp.setSalary(980000);
		
//		Employee emp1 = new Employee();
//		emp1.setId(102);
//		emp1.setTitle("Cat");
//		emp1.setEmail("cat@gmail.com");
//		emp1.setSalary(880000);
		
		Employee emp2 = new Employee();
		emp2.setId(103);
		emp2.setTitle("Jerry");
		emp2.setEmail("jerry@gmail.com");
		emp2.setSalary(850000);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		em.persist(emp2);
		
		et.commit();
		em.close();
	}
}
