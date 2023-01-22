package com.authentication.users.dao;

import com.authentication.users.models.entity.UserEntity;

public interface UserDao {

    UserEntity createUser(UserEntity user);

}
