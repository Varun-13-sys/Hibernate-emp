package com.dcl.hibernate.jpa.employee;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppDelete {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		System.out.println("Enter the Id to delete the Employee");
		Employee emp = em.find(Employee.class, scan.nextInt());
		if (emp != null) {
			em.remove(emp);
			et.commit();
			System.out.println("Deleted");
		} else
			System.out.println("Error");
		em.close();
		scan.close();
	}
}
