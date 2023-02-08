package com.authentication.users.service.impl;

import com.authentication.users.dao.UserDao;
import com.authentication.users.models.domain.User;
import com.authentication.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao dao;

    @Override
    public User createUser(User user) {
        return dao.createUser(user);
    }
}
