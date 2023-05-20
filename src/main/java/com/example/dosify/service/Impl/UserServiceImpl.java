package com.example.dosify.service.Impl;

import com.example.dosify.Model.User;
import com.example.dosify.dto.RequestDTO.UserRequestDto;
import com.example.dosify.dto.ResponseDTO.UserResponseDto;
import com.example.dosify.repository.UserRepository;
import com.example.dosify.service.UserService;
import com.example.dosify.transformer.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserResponseDto addUser(UserRequestDto userRequestDto){
        //convert request dto to entity
//        User user = new User();
//        user.setName(userRequestDto.getName());
//        user.setMobNo(userRequestDto.getMobNo());
//        user.setAge(userRequestDto.getAge());
//        user.setGender(userRequestDto.getGender());
//        user.setEmailId(userRequestDto.getEmailId());
        //other parameter take the default value

        //create object using Builder //ab ek line me code ho gya upr wala hi code hai using builder

//        User user = User.builder()
//                .name(userRequestDto.getName())
//                .age(userRequestDto.getAge())
//                .emailId(userRequestDto.getEmailId())
//                .mobNo(userRequestDto.getMobNo())
//                .gender(userRequestDto.getGender())
//                .build();

        User user = UserTransformer.UserRequestToDto(userRequestDto);//value set using transformer

        //save the object in db
        User savedUser = userRepository.save(user);

        //return to controller as >entity to  response dto
//        UserResponseDto userResponseDto = new UserResponseDto();
//
//        userResponseDto.setName(savedUser.getName());
//        userResponseDto.setMessage("Congratulations! you have registered on Dosify");

        UserResponseDto userResponseDto = UserTransformer.UsertoUserResponseDto(savedUser);
        return userResponseDto;
//
//        UserResponseDto userResponseDto = UserResponseDto.builder()
//                .name(savedUser.getName())
//                .message("Congratulations! you have registered on Dosify")
//                .build();
//        return userResponseDto;


    }
//    public UserResponseDto getUserById(int id) {
//        return userRepository.findById(id).get();
//    }
//    public UserResponseDto getUserByMob(int mobNo) {
//        return userRepository.findBy(mobNo).get();
//    }
}
