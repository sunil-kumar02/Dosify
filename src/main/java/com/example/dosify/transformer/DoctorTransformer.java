package com.example.dosify.transformer;

import com.example.dosify.Model.Doctor;
import com.example.dosify.dto.RequestDTO.DoctorRequestDto;
import com.example.dosify.dto.ResponseDTO.CenterResponseDto;
import com.example.dosify.dto.ResponseDTO.DoctorResponseDto;

public class DoctorTransformer {
    public static Doctor DoctorRequestDtoToDoctor(DoctorRequestDto doctorRequestDto){
        return Doctor.builder()
                .name(doctorRequestDto.getName())
                .age(doctorRequestDto.getAge())
                .mobNo(doctorRequestDto.getMobNo())
                .gender(doctorRequestDto.getGender())
                .emailId(doctorRequestDto.getEmailId())
                .build();//set in serviceimpl layer the vaccination center

    }
    public static DoctorResponseDto DoctorToDoctorResponseDto(Doctor doctor) {

        CenterResponseDto centerResponseDto = VaccinationCenterTransformer.CenterToCenterResponseDto(doctor.getVaccinationCenter());

        return DoctorResponseDto.builder()
                .name(doctor.getName())
                .emailId(doctor.getEmailId())
                .mobNo(doctor.getMobNo())
                .centerResponseDto(centerResponseDto)
                .build();
    }
}
