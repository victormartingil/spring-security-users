package com.authentication.users.models.dto;

import com.authentication.users.models.entity.RoleEntity;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {

    private String id;
    private String username;
    private String password;
    private String email;
    private Boolean enabled;
    private List<RoleEntity> roleEntities;

}
