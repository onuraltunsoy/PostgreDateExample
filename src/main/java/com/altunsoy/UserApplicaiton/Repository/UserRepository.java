package com.altunsoy.UserApplicaiton.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.altunsoy.UserApplicaiton.Model.User;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByName(String name);

}

