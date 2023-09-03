package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Studentdet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Pavan");
      EntityManager entityManager = entityManagerFactory.createEntityManager();
      EntityTransaction entityTransaction = entityManager.getTransaction();
      
      Student student = new Student();
      student.setId(2);
      student.setName("Bhagyashree");
      student.setAge(22);
      student.setGender("Female");
      student.setPhno(458525485);
      
      
      entityTransaction.begin();
      entityManager.persist(student);
      entityTransaction.commit();
      
	}

}
