package com.example.dosify.service;

import com.example.dosify.dto.RequestDTO.DoctorRequestDto;
import com.example.dosify.dto.ResponseDTO.DoctorResponseDto;
import com.example.dosify.exception.CenterNotPresentException;

public interface DoctorService {
    public DoctorResponseDto addDoctor(DoctorRequestDto doctorRequestDto)throws CenterNotPresentException;
}
