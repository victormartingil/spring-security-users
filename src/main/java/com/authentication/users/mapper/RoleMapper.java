package com.authentication.users.mapper;

import com.authentication.users.models.entity.RoleEntity;
import org.mapstruct.Mapper;
import org.openapitools.client.model.RoleTypeDto;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    RoleEntity dtoToEntity(RoleTypeDto roleDto);

    RoleTypeDto entityToDto(RoleEntity roleEntity);

}
