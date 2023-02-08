package com.authentication.users.dao.impl;

import com.authentication.users.dao.UserDao;
import com.authentication.users.models.domain.User;
import com.authentication.users.repository.UserMongoRepository;
import com.authentication.users.repository.mapper.UserRepositoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDaoMongoImpl implements UserDao {

    @Autowired
    UserMongoRepository repository;

    @Autowired
    UserRepositoryMapper userMapper;

    @Override
    public User createUser(final User user) {
        return userMapper.map(repository.save(userMapper.map(user)));
    }
}
