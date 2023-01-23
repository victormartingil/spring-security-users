package com.authentication.users.mapper;

import com.authentication.users.models.dto.RoleDto;
import com.authentication.users.models.entity.RoleEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleEntity dtoToEntity(RoleDto roleDto);

    RoleDto entityToDto(RoleEntity roleEntity);

}
