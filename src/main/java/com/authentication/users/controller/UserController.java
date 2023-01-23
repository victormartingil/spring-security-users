package com.authentication.users.controller;

import com.authentication.users.mapper.UserMapper;
import com.authentication.users.models.entity.UserEntity;
import com.authentication.users.service.UserService;
import org.openapitools.client.model.UserQueryDto;
import org.openapitools.client.model.UserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService service;
    @Autowired
    UserMapper mapper;

    @PostMapping("")
    public ResponseEntity<UserResponseDto> createUser(@RequestBody UserQueryDto user) {
        UserEntity response = service.createUser(mapper.dtoToEntity(user));
        return new ResponseEntity<>(mapper.entityToDto(response), HttpStatus.OK);
    }

}
