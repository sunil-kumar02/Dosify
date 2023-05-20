package com.example.dosify.controller;

import com.example.dosify.Model.User;
import com.example.dosify.dto.RequestDTO.UserRequestDto;
import com.example.dosify.dto.ResponseDTO.UserResponseDto;
import com.example.dosify.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired UserService userService;
    @PostMapping("/add")
    public ResponseEntity addUser(@RequestBody UserRequestDto userRequestDto){

       UserResponseDto userResponseDto =  userService.addUser(userRequestDto);
       //response entity send the own status code and return response;
        return new ResponseEntity(userResponseDto, HttpStatus.CREATED);
    }
//    @GetMapping("/get/{id}")
//    public UserResponseDto getUserById(@PathVariable int id){
//
//        return userService.getUserById(id);
//    }
//
//    @GetMapping("/get/{mobNo}")
//    public UserResponseDto getUserByMob(@RequestParam int mobNo){
//        return userService.getUserByMob(mobNo);
//    }


}
