package de.ykoer.services.user.controller;

import java.util.List;

import de.ykoer.services.user.model.User;
import de.ykoer.services.user.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	UserRepository repository;
	
	@PostMapping("/")
	public User add(@RequestBody User employee) {
		LOGGER.info("User add: {}", employee);
		return repository.add(employee);
	}
	
	@GetMapping("/{id}")
	public User findById(@PathVariable("id") Long id) {
		LOGGER.info("User find: id={}", id);
		return repository.findById(id);
	}
	
	@GetMapping("/")
	public List<User> findAll() {
		LOGGER.info("User find");
		return repository.findAll();
	}
	
	@GetMapping("/department/{lastName}")
	public List<User> findByLastName(@PathVariable("lastName") String lastName) {
		LOGGER.info("User find: departmentId={}", lastName);
		return repository.findByLastName(lastName);
	}
	
}
