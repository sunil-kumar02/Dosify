package com.example.dosify.dto.RequestDTO;

import com.example.dosify.Enum.DoseNo;
import com.example.dosify.Enum.VaccinationType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =  AccessLevel.PRIVATE)
public class AppointmentRequestDto {
    DoseNo doseNo;

    int userId;

    int doctorId;

    VaccinationType vaccineType;
}
