package com.dcl.hibernate.jpa.employee;

import javax.persistence.EntityManagerFactory;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class AppFind {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
		EntityManager em = emf.createEntityManager();
		System.out.println("Enter the Id to find Employee");
		Employee emp = em.find(Employee.class, scan.nextInt());
		if (emp != null)
			System.out.println(emp);
		else
			System.out.println("error");
		em.close();
		scan.close();
	}
}
