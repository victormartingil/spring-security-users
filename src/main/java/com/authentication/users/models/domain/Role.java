package com.authentication.users.models.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Role {

    BASIC("BASIC"),
    ADMIN("ADMIN"),
    SUPERADMIN("SUPERADMIN");

    private final String value;

}
