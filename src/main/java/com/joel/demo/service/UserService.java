package com.joel.demo.service;

import com.joel.demo.model.User;

public interface UserService {

    User register(User user);

    void login(String username, String password);
}