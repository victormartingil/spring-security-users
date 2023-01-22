package com.authentication.users.controller;

import com.authentication.users.models.dto.UserDto;
import com.authentication.users.models.entity.UserEntity;
import com.authentication.users.models.entity.mapper.UserMapper;
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
    @Autowired
    UserMapper mapper;

    @PostMapping("/save")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto user) {
        UserEntity response = service.createUser(mapper.dtoToEntity(user));
        return new ResponseEntity<>(mapper.entityToDto(response), HttpStatus.OK);
    }

}
