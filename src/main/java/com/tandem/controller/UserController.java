package com.tandem.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tandem.model.User;
import com.tandem.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Resource
	UserService mUserService;

	@GetMapping
	public List<User> getUsers() {
		return mUserService.findAll();
	}

	@PostMapping
	public void createUser(@RequestBody User emp) {
		mUserService.insertUser(emp);
	}

	@PutMapping
	public void updateUser(@RequestBody User emp) {
		mUserService.updateUser(emp);
	}

	@PutMapping(value = "/update")
	public void executeUpdateUser(@RequestBody User emp) {
		mUserService.executeUpdateUser(emp);
	}

	@DeleteMapping
	public void deleteUser(@RequestBody User emp) {
		mUserService.deleteUser(emp);
	}

}
