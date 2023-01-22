package com.authentication.users.controller;

import com.authentication.users.models.dto.RoleDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/role")
public class RoleController {

    @PostMapping
    ResponseEntity<RoleDto> createRole(RoleDto roleDto) {

        return new ResponseEntity<>(roleDto, HttpStatus.NOT_IMPLEMENTED);
    }

}
