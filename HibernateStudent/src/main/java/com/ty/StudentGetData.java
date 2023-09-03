package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class StudentGetData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Pavan");
	    EntityManager entityManager=entityManagerFactory.createEntityManager();
	      
	      Student student=entityManager.find(Student.class,1);
	      System.out.println("The student id is:"+student.getId());
	      System.out.println("The student name is:"+student.getName());
	      System.out.println("The student age is:"+student.getAge());
	      System.out.println("The student phno is:"+student.getPhno());
	      System.out.println("The student phno is:"+student.getGender());
	}

}
