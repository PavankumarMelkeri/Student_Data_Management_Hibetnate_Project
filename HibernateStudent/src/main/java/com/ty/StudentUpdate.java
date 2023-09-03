package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Pavan");
	     EntityManager entityManager=entityManagerFactory.createEntityManager();
	     EntityTransaction entityTransaction=entityManager.getTransaction();
	     
	     Student student=entityManager.find(Student.class,1);
	     student.setName("Pavankumar");
	     
	     entityTransaction.begin();
	     entityManager.merge(student);
	     entityTransaction.commit();
	}

}
