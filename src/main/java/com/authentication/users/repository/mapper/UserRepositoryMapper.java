package com.authentication.users.repository.mapper;

import com.authentication.users.models.domain.User;
import com.authentication.users.models.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserRepositoryMapper {

    User map(UserEntity userQueryDto);

    UserEntity map(User user);

}
