package com.authentication.users.controller;

import com.authentication.users.repository.UserMongoRepository;
import com.authentication.users.models.entity.User;
import com.authentication.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/save")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User response = service.createUser(user);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
