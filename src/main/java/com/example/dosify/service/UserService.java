package com.example.dosify.service;

import com.example.dosify.Model.User;
import com.example.dosify.dto.RequestDTO.UserRequestDto;
import com.example.dosify.dto.ResponseDTO.UserResponseDto;
import org.springframework.http.ResponseEntity;

public interface UserService {
    UserResponseDto addUser(UserRequestDto userRequestDto);

//    UserResponseDto getUserById(int id);
//
//    UserResponseDto getUserByMob(int mobNo);
}
