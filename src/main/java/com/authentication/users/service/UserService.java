package com.authentication.users.service;

import com.authentication.users.models.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {

    public User createUser(User user);

}
