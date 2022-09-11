package com.cg.client;

import com.cg.entities.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) 
	{
		StudentService service=new StudentServiceImpl();
		Student s=new Student();
		/*//create Operation
		s.setRollno(111);
		s.setName("Mayuri");
		service.addStudent(s);*/
		
		/*//create Operation
				s.setRollno(112);
				s.setName("Manali");
				service.addStudent(s);
				*/
		
				/*//retrieve data
				s=service.getStudentById(112);
				System.out.println("Student Roll No:"+s.getRollno());
				System.out.println("Student Name:"+s.getName());*/
		/*//update
		s=service.getStudentById(112);
		s.setName("Kiran");
		service.updateStudent(s);*/
		//delete
		s=service.getStudentById(111);
		service.deleteStudent(s);
		System.out.println("Data is deleted");
		
				
		

	}

}
