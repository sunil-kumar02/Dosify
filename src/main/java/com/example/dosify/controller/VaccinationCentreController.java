package com.example.dosify.controller;

import com.example.dosify.Model.VaccinationCenter;
import com.example.dosify.dto.RequestDTO.CenterRequestDto;
import com.example.dosify.dto.ResponseDTO.CenterResponseDto;
import com.example.dosify.service.VaccinationCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Center")
public class VaccinationCentreController {
    @Autowired
    VaccinationCenterService vaccinationCenterService;
    @PostMapping("/add")
    public ResponseEntity addVaccinationCenter(@RequestBody CenterRequestDto centerRequestDto){

        CenterResponseDto centerResponseDto = vaccinationCenterService.addCenter(centerRequestDto);
        return new ResponseEntity(centerResponseDto,HttpStatus.CREATED);

    }

}
