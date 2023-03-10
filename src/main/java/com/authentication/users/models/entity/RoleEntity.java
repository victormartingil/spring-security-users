package com.authentication.users.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RoleEntity {

    BASIC("BASIC"),
    ADMIN("ADMIN"),
    SUPERADMIN("SUPERADMIN");

    private final String value;

}
