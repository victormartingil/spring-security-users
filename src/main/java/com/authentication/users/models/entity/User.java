package com.authentication.users.models.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Document
@Table(name = "users")
@Data
public class User implements Serializable {


    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Column(unique = true, length = 20)
    private String username;

    private String password;

    @Column(unique = true)
    private String email;

    private Boolean enabled;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Role> roles;
}
