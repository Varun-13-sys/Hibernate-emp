package com.dcl.hibernate.jpa.employee;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppUpdate {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		System.out.println("Enter the id to Update salary");
		Employee emp = em.find(Employee.class, scan.nextInt());

		if (emp != null) {
			emp.setSalary(1500000);
			em.merge(emp);
			et.commit();
			System.out.println("Updated the Salary");
		} else
			System.out.println("Salary Not Updated ");
		em.close();
		scan.close();
	}
}
