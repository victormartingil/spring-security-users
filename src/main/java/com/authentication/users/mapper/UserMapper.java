package com.authentication.users.mapper;

import com.authentication.users.models.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.openapitools.client.model.UserQueryDto;
import org.openapitools.client.model.UserResponseDto;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "enabled", constant = "true")
    UserEntity dtoToEntity(UserQueryDto userQueryDto);

    UserResponseDto entityToDto(UserEntity userEntity);

}
