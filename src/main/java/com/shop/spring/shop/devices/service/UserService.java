package com.shop.spring.shop.devices.service;

import com.shop.spring.shop.devices.model.Role;
import com.shop.spring.shop.devices.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
