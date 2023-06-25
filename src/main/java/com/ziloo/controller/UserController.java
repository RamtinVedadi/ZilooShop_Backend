package com.ziloo.controller;

import com.ziloo.model.User;
import com.ziloo.service.UserManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {
    private UserManager um;

    @PostMapping(path = "/create")
    public ResponseEntity create(@RequestBody User user) {
        return um.create(user);
    }
}
