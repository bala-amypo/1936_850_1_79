package com.example.demo.service.impl;

import com.example.demo.service.UserService;
import com.example.demo.repository.UserRepository;
import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repo;

    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

    public User register(User user) {
        return repo.save(user);
    }

    public User findByEmail(String email) {
        return repo.findByEmail(email).orElse(null);
    }
}
