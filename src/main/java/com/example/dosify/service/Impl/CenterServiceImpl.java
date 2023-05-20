package com.example.dosify.service.Impl;

import com.example.dosify.Model.VaccinationCenter;
import com.example.dosify.dto.RequestDTO.CenterRequestDto;
import com.example.dosify.dto.ResponseDTO.CenterResponseDto;
import com.example.dosify.repository.CenterRepository;
import com.example.dosify.service.VaccinationCenterService;
import com.example.dosify.transformer.VaccinationCenterTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CenterServiceImpl implements VaccinationCenterService {

    @Autowired
    CenterRepository centerRepository;

    @Override
    public CenterResponseDto addCenter(CenterRequestDto centerRequestDto) {
        // dto -> entity
        VaccinationCenter vaccinationCenter = VaccinationCenterTransformer.CenterRequestDtoToCenter(centerRequestDto);
        // save to your db
        VaccinationCenter savedCenter = centerRepository.save(vaccinationCenter);
        // entity -> response dto
        return VaccinationCenterTransformer.CenterToCenterResponseDto(savedCenter);
    }
}