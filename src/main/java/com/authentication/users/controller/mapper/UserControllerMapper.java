package com.authentication.users.controller.mapper;

import com.authentication.users.models.domain.User;
import org.mapstruct.Mapper;
import org.openapitools.client.model.UserQueryDto;
import org.openapitools.client.model.UserResponseDto;

import java.time.OffsetDateTime;

@Mapper(componentModel = "spring")
public interface UserControllerMapper {

    User map(UserQueryDto userQueryDto);

    UserResponseDto map(User user);

    default User dtoToEntity(final UserQueryDto userQueryDto) {
        final User user = map(userQueryDto);
        user.setEnabled(true);
        user.setCreatedAt(OffsetDateTime.now().toString());
        return user;
    }

}
