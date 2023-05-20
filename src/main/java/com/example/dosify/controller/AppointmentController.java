package com.example.dosify.controller;

import com.example.dosify.dto.RequestDTO.AppointmentRequestDto;
import com.example.dosify.dto.ResponseDTO.AppointmentResponseDto;
import com.example.dosify.exception.DoctorNotFoundException;
import com.example.dosify.exception.NotEligibleForDoseException;
import com.example.dosify.exception.UserNotFoundException;
import com.example.dosify.service.AppointmentService;
import com.example.dosify.service.Impl.AppointmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownServiceException;

@RestController
@RequestMapping("/Appointment")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;

    @PostMapping("/book")
    public AppointmentResponseDto bookAppointment(@RequestBody AppointmentRequestDto appointmentRequestDto) throws UserNotFoundException, DoctorNotFoundException, UnknownServiceException, NotEligibleForDoseException {

        return appointmentService.bookAppointment(appointmentRequestDto);
    }

    // generate certificate
    // -> One dose
    // -> Both dose
}
