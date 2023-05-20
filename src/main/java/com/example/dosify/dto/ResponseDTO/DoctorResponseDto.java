package com.example.dosify.dto.ResponseDTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =  AccessLevel.PRIVATE)
@Builder

public class DoctorResponseDto {
    String name;

    String emailId;

    String mobNo;

    CenterResponseDto centerResponseDto;//to use center type in centre response dto
}
