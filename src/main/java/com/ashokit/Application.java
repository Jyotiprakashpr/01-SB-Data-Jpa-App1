package com.ashokit;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.User;
import com.ashokit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(Application.class, args);
		UserRepository userRepo = context.getBean(UserRepository.class);
		//System.out.println(userRepo.getClass().getName());
		
		
		  User entity1 = new User(); 
		  entity1.setUserId(104); 
		  entity1.setUserName("Jass Manak2");
		  entity1.setUserAge(25); 
		  entity1.setUserPhno(7077709508l);
		  entity1.setUserCountry("USA");
		  
		  userRepo.save(entity1);
		 // System.out.println("********  Record Inserted    **********");
		 
		
		/*
		 * User entity2 = new User(); entity2.setUserId(102);
		 * entity2.setUserName("Diljit"); entity2.setUserAge(25);
		 * entity2.setUserPhno(7077709509l); entity2.setUserCountry("India");
		 * //userRepo.save(entity2);
		 * 
		 * 
		 * User entity3= new User(); entity3.setUserId(103);
		 * entity3.setUserName("raja"); entity3.setUserAge(25);
		 * entity3.setUserPhno(7077709510l); entity3.setUserCountry("India");
		 * //userRepo.save(entity3);
		 * 
		 * List<User> entitiesList = Arrays.asList(entity2,entity3);
		 * userRepo.saveAll(entitiesList);
		 */
		
		/*
		 * Optional<User>findById = userRepo.findById(101); if(findById.isPresent()) {
		 * System.out.println(findById.get()); }
		 */
		/*
		 * Iterable<User>findAllById = userRepo.findAllById(Arrays.asList(101,103));
		 * findAllById.forEach(user -> { System.out.println(user); });
		 */
		//System.out.println("Total Records :"+ userRepo.count());
		//userRepo.deleteById(103);
		
	}

}
