package com.springboottest.test.service;

import org.springframework.stereotype.Service;
import com.springboottest.test.model.Users;
import com.springboottest.test.repository.UsersRepository;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users createUsers(String name, String email) {
        Users users = new Users();
        users.setName(name);
        users.setEmail(email);
        return usersRepository.save(users);
    }

    // その他のメソッドも追加できます
}
