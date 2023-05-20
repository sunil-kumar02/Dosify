package com.example.dosify.service;

import com.example.dosify.dto.RequestDTO.CenterRequestDto;
import com.example.dosify.dto.ResponseDTO.CenterResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VaccinationCenterService{
    public CenterResponseDto addCenter(CenterRequestDto centerRequestDto);
}
