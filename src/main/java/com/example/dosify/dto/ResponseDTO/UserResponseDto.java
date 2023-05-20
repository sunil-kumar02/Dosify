package com.example.dosify.dto.ResponseDTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =  AccessLevel.PRIVATE)
@Builder

public class UserResponseDto {
    String name;
    String message;
}
