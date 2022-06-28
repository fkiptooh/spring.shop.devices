package com.shop.spring.shop.devices.service;

import com.shop.spring.shop.devices.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
