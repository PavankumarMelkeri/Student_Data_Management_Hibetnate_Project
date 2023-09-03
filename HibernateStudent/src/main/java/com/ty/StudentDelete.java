package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class StudentDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Pavan");
		 EntityManager entityManager=entityManagerFactory.createEntityManager();
		 EntityTransaction entityTransaction=entityManager.getTransaction();
		 Student student=entityManager.find(Student.class,2);
		 if(student!=null) {
		    	entityTransaction.begin();
		    	entityManager.remove(student);
		    	entityTransaction.commit();
		    }
		    else {
		    	System.out.println("Data not found");
		    }
			
	}

}
