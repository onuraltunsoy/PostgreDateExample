package com.altunsoy.UserApplicaiton;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.altunsoy.UserApplicaiton.Model.User;
import com.altunsoy.UserApplicaiton.Repository.UserRepository;


@RestController
public class UserController {

	@Autowired
    private UserRepository repository;
	
	  @GetMapping("/users")
	    public List<User> getAllUSer() {
	        return (List<User>) repository.findAll();
	    }
	  @PostMapping("/user")
	    public User createQuestion(@Valid @RequestBody User user) {
	        return repository.save(user);
	    }
}
