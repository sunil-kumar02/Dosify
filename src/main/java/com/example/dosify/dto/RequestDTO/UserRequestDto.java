package com.example.dosify.dto.RequestDTO;

import com.example.dosify.Enum.Gender;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =  AccessLevel.PRIVATE)
//we will not take entity as yh hmare database me nhi ja rha hai only taking request from controller
public class UserRequestDto {
    String name;

    int age;

    String emailId;

    String mobNo;

    Gender gender;
}
