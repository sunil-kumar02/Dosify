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
public class DoctorRequestDto {
    int centerId;

    String name;

    int age;

    String emailId;

    String mobNo;

    Gender gender;


}
