/**
 * 
 */
package com.example.restfirebasedemo.controller;


import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.restfirebasedemo.model.Person;
import com.example.restfirebasedemo.service.FirebaseService;


/**
 * @author rudi_
 * @date Nov 22, 2021
 */

@RestController
@CrossOrigin
public class MainController {
	
	@Autowired
	FirebaseService firebaseService;
	
	@GetMapping("/getUserDetails")
	public Object getExample(@RequestHeader() String name) throws InterruptedException, ExecutionException {
		return firebaseService.getUserDetails(name);
	}
	
	@PostMapping("/createUser")
	public String postExample(@RequestBody Person person) throws InterruptedException, ExecutionException {
		return firebaseService.saveUserDetail(person);
	}
	
	@PutMapping("/updateUser")
	public String putExample(@PathVariable Person person) {
		return "Updated user "+person.getName();
	}
	
	@DeleteMapping("/deleteUser")
	public String deleteExample(@RequestHeader String name) {
		return "Deleted user "+name;
	}
	
	
}
