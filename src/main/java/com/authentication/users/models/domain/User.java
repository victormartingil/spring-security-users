package com.authentication.users.models.domain;

import com.authentication.users.models.entity.RoleEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String id;

    private String username;

    private String password;

    private String email;

    private boolean enabled;

    private RoleEntity role;

    private String createdAt;

}
