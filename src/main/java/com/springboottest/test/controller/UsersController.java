package com.springboottest.test.controller;

import com.springboottest.test.model.Users;
import com.springboottest.test.repository.UsersRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    private final UsersRepository usersRepository;

@Autowired
public UsersController(UsersRepository usersRepository) {
    this.usersRepository = usersRepository;
}

@GetMapping("/get")
public List<Users> getUsers() {
    return usersRepository.findAll();
}

@PostMapping("/create")
public Users createUser(@RequestBody Users users) {
    return usersRepository.save(users);

}
}
