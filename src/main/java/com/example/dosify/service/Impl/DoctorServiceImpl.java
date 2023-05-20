package com.example.dosify.service.Impl;

import com.example.dosify.Model.Doctor;
import com.example.dosify.Model.VaccinationCenter;
import com.example.dosify.dto.RequestDTO.DoctorRequestDto;
import com.example.dosify.dto.ResponseDTO.DoctorResponseDto;
import com.example.dosify.exception.CenterNotPresentException;
import com.example.dosify.repository.CenterRepository;
import com.example.dosify.service.DoctorService;
import com.example.dosify.transformer.DoctorTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    CenterRepository centerRepository;
    public DoctorResponseDto addDoctor(DoctorRequestDto doctorRequestDto) throws CenterNotPresentException {
        //check center exist or not

        Optional<VaccinationCenter> optionalCenter =centerRepository.findById(doctorRequestDto.getCenterId());
        if(!optionalCenter.isPresent()){
            throw new CenterNotPresentException("Invalid center id");//exception never written for client its for developer.
        }
        VaccinationCenter center = optionalCenter.get();
        //dto to entity
        Doctor doctor = DoctorTransformer.DoctorRequestDtoToDoctor(doctorRequestDto);
        doctor.setVaccinationCenter(center);

        // add doctor to current list of doctors at that center
        center.getDoctors().add(doctor);

        VaccinationCenter savedCenter = centerRepository.save(center);  // saves both center and doctor

        // prepare response Dto
        return DoctorTransformer.DoctorToDoctorResponseDto(doctor);



    }
}
