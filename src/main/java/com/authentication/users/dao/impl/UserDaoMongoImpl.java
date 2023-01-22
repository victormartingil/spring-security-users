package com.authentication.users.dao.impl;

import com.authentication.users.dao.UserDao;
import com.authentication.users.models.entity.UserEntity;
import com.authentication.users.repository.UserMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDaoMongoImpl implements UserDao {

    @Autowired
    UserMongoRepository repository;

    @Override
    public UserEntity createUser(UserEntity user) {
        return repository.save(user);
    }
}
