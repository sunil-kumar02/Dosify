package com.example.dosify.service;

import com.example.dosify.dto.RequestDTO.AppointmentRequestDto;
import com.example.dosify.dto.ResponseDTO.AppointmentResponseDto;
import com.example.dosify.exception.DoctorNotFoundException;
import com.example.dosify.exception.NotEligibleForDoseException;
import com.example.dosify.exception.UserNotFoundException;

public interface AppointmentService {
    public AppointmentResponseDto bookAppointment(AppointmentRequestDto appointmentRequestDto) throws UserNotFoundException, DoctorNotFoundException, NotEligibleForDoseException;

}
