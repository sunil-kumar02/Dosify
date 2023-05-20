package com.example.dosify.dto.ResponseDTO;

import com.example.dosify.Enum.DoseNo;
import com.example.dosify.Enum.VaccinationType;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =  AccessLevel.PRIVATE)

@Builder
public class AppointmentResponseDto {
    String userName;

    String appointmentNo;

    Date dateOfAppointment;

    DoseNo doseNo;

    CenterResponseDto centerResponseDto;

    String doctorName;

    VaccinationType vaccineType;


}
