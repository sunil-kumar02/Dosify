package com.example.dosify.transformer;

import com.example.dosify.Model.Doctor;
import com.example.dosify.Model.VaccinationCenter;
import com.example.dosify.dto.RequestDTO.CenterRequestDto;
import com.example.dosify.dto.ResponseDTO.CenterResponseDto;
import com.example.dosify.dto.ResponseDTO.DoctorResponseDto;

public class VaccinationCenterTransformer {
    public static VaccinationCenter CenterRequestDtoToCenter(CenterRequestDto centerRequestDto){
        return VaccinationCenter.builder()
                .name(centerRequestDto.getName())
                .location(centerRequestDto.getLocation())
                .centerType(centerRequestDto.getCenterType())
                .build();
    }

    public static CenterResponseDto CenterToCenterResponseDto(VaccinationCenter center){
        return CenterResponseDto.builder()
                .location(center.getLocation())
                .name(center.getName())
                .centerType(center.getCenterType())
                .build();
    }
    public static DoctorResponseDto DoctorToDoctorResponseDto(Doctor doctor) {

        CenterResponseDto centerResponseDto = VaccinationCenterTransformer.CenterToCenterResponseDto(doctor.getVaccinationCenter());

        return DoctorResponseDto.builder()
                .name(doctor.getName())
                .emailId(doctor.getEmailId())
                .mobNo(doctor.getMobNo())
                .centerResponseDto(centerResponseDto)//we have to set vaccination center also
                .build();
    }
}
