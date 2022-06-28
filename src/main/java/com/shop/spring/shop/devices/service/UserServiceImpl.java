package com.shop.spring.shop.devices.service;

import com.shop.spring.shop.devices.model.Role;
import com.shop.spring.shop.devices.model.User;
import com.shop.spring.shop.devices.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user){
        // encode password
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setCreateTime(LocalDateTime.now());

        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByUsername(String username){
       return userRepository.findByUsername(username);
    }

    @Override
    @Transactional
    public void changeRole(Role newRole, String username){
        userRepository.updateUserRole(username, newRole);
    }

}
