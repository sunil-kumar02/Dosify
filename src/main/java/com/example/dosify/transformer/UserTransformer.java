package com.example.dosify.transformer;

import com.example.dosify.Model.User;
import com.example.dosify.dto.RequestDTO.UserRequestDto;
import com.example.dosify.dto.ResponseDTO.UserResponseDto;
import lombok.experimental.UtilityClass;

@UtilityClass//means you dont have permission to create an object.
public class UserTransformer {

    public static User UserRequestToDto(UserRequestDto userRequestDto){
        return User.builder()
                .name(userRequestDto.getName())
                .age(userRequestDto.getAge())
                .emailId(userRequestDto.getEmailId())
                .mobNo(userRequestDto.getMobNo())
                .gender(userRequestDto.getGender())
                .build();


    }
    public static UserResponseDto UsertoUserResponseDto(User user){
        return UserResponseDto.builder()
                .name(user.getName())
                .message("Congratulations! you have registered on Dosify")
                .build();
    }

}
