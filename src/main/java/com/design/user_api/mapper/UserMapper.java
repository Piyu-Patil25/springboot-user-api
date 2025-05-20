package com.design.user_api.mapper;

import com.design.user_api.dto.UserRequestDTO;
import com.design.user_api.dto.UserResponseDTO;
import com.design.user_api.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserRequestDTO dto);
    UserResponseDTO toDto(User user);
}

