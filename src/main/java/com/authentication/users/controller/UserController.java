package com.authentication.users.controller;

import com.authentication.users.controller.mapper.UserControllerMapper;
import com.authentication.users.models.domain.User;
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
    UserControllerMapper mapper;

    @PostMapping("")
    public ResponseEntity<UserResponseDto> createUser(@RequestBody final UserQueryDto userQueryDto) {
        final User response = service.createUser(mapper.dtoToEntity(userQueryDto));
        return new ResponseEntity<>(mapper.map(response), HttpStatus.OK);
    }

}
