package com.data.jpa.hibernatejpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaApplication.class, args);
	}
		
		@Bean
		public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
			return runner->{
			//	createStudent(studentDAO);
				createMultipleStudent(studentDAO);
			};
		}

		private void createMultipleStudent(StudentDAO studentDAO) {
			
			System.out.println("Creating an Object of Student 1");
			Student tempStudent1 = new Student("Rahul", "Raj", "rahul87@gmail.com");
			
			System.out.println("Creating an Object of Student 2");
			Student tempStudent2 = new Student("Madhu", "Kumar", "madhucr163@gmail.com");
			
			System.out.println("Creating an Object of Student 3");
			Student tempStudent3 = new Student("Vittal", "Poojari", "vittalpoojari27@gmail.com");
			
			System.out.println("Creating an Object of Student 4");
			Student tempStudent4 = new Student("Vijay", "Raj", "vijayraj0206@gmail.com");
			
			System.out.println("Creating an Object of Student 5");
			Student tempStudent5 = new Student("Ruthik", "Kumar", "ruthik1212@gmail.com");
			
			System.out.println("Saving Student Object 1");
			studentDAO.save(tempStudent1);
			
			System.out.println("Saving Student Object 2");
			studentDAO.save(tempStudent2);
			
			System.out.println("Saving Student Object 3");
			studentDAO.save(tempStudent3);
			
			System.out.println("Saving Student Object 4");
			studentDAO.save(tempStudent4);
			
			System.out.println("Saving Student Object 5");
			studentDAO.save(tempStudent5);
			
		}

		private void createStudent(StudentDAO studentDAO) {
			
			System.out.println("Creating an Object of an Student");
			Student tempStudent = new Student("shiva","Raj","shivarajks45@gmail.com");
			
			System.out.println("Saving the Student Object");
			studentDAO.save(tempStudent);
			
			System.out.println("Display the generated ID: "+ tempStudent.getId());
			
		}
	

}
