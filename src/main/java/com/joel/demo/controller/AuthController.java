package com.joel.demo.controller;

import com.joel.demo.model.User;
import com.joel.demo.security.JwtUtil;
import com.joel.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    private final JwtUtil jwtUtil;

    public AuthController(UserService userService, JwtUtil jwtUtil) {
        this.userService = userService;
        this.jwtUtil = jwtUtil;
    }

    // 🔹 Register
    @PostMapping("/register")
    public String register(@RequestBody User user) {

        userService.register(user);

        return "User registered successfully";
    }

    // 🔹 Login
    @PostMapping("/login")
    public String login(@RequestBody User user) {

        userService.login(user.getUsername(), user.getPassword());

        return jwtUtil.generateToken(user.getUsername());
    }
}