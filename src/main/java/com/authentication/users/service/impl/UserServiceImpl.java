package com.authentication.users.service.impl;

import com.authentication.users.dao.UserDao;
import com.authentication.users.models.entity.UserEntity;
import com.authentication.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao dao;

    @Override
    public UserEntity createUser(UserEntity user) {
        return dao.createUser(user);
    }
}
