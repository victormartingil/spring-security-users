package com.authentication.users.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String username;

    private String password;

    private String email;

    private boolean enabled;

    private RoleEntity role;

    private String createdAt;

}
