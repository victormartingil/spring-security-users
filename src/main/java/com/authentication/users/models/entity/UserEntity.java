package com.authentication.users.models.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Document(collection = "users")
@Data
public class UserEntity implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String username;

    private String password;

    private String email;

    private Boolean enabled;

    private List<RoleEntity> roleEntities;
}
