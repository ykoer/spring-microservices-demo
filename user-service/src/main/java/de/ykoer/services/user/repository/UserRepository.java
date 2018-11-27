package de.ykoer.services.user.repository;

import de.ykoer.services.user.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserRepository {

	private List<User> users = new ArrayList<>();
	
	public User add(User user) {
		user.setId((long) (users.size()+1));
		users.add(user);
		return user;
	}
	
	public User findById(Long id) {
		Optional<User> user = users.stream().filter(a -> a.getId().equals(id)).findFirst();
		if (user.isPresent())
			return user.get();
		else
			return null;
	}

	public List<User> findByLastName(String lastName) {
		return users.stream().filter(a -> a.getLasteName().equals(lastName)).collect(Collectors.toList());
	}
	
	public List<User> findAll() {
		return users;
	}
	
}
