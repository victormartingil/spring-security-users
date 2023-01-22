package com.authentication.users.models.entity.mapper;

import com.authentication.users.models.dto.UserDto;
import com.authentication.users.models.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity dtoToEntity(UserDto userDto);

    UserDto entityToDto(UserEntity userEntity);
}
