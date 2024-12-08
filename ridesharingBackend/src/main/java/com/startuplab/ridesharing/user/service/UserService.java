package com.startuplab.ridesharing.user.service;

import com.startuplab.ridesharing.user.model.Users;
import com.startuplab.ridesharing.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService  {

    @Autowired
    private UserRepository userRepository;

    public void save(Users user) {
        userRepository.save(user);
    }
}
