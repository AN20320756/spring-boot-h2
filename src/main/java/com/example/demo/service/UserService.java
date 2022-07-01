package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;
import java.util.*;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User createUser(User user) {
		return repository.save(user);

	}

	public List<User> createUsers(List<User> users) {

		return repository.saveAll(users);

	}

	public User getUserById(int id) {
		return repository.findById(id).orElse(null);

	}

	public List<User> getUsers() {
		return repository.findAll();

	}

	public User updateUser(User user) {
		User oldUser = null;

		Optional<User> optUser = repository.findById(user.getId());

		if (optUser.isPresent()) {

			oldUser = optUser.get();
			oldUser.setName(user.getName());
			oldUser.setAddress(user.getAddress());

			repository.save(oldUser);
		}

		else {
			return new User();

		}
		return oldUser;

	}

	public String deleteUserById(int id) {

		repository.deleteById(id);

		return "User deleted";

	}

}
