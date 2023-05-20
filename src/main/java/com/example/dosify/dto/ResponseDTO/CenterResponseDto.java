package com.example.dosify.dto.ResponseDTO;

import com.example.dosify.Enum.CenterType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =  AccessLevel.PRIVATE)

@Builder
public class CenterResponseDto {
    String name;

    String location;

    CenterType centerType;

}
