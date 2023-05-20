//package com.example.dosify.transformer;
//
//import com.example.dosify.Enum.DoseNo;
//import com.example.dosify.Model.*;
//import com.example.dosify.dto.RequestDTO.AppointmentRequestDto;
//import com.example.dosify.dto.RequestDTO.DoctorRequestDto;
//import com.example.dosify.dto.ResponseDTO.AppointmentResponseDto;
//import com.example.dosify.dto.ResponseDTO.DoctorResponseDto;
//import com.example.dosify.exception.DoctorNotFoundException;
//import com.example.dosify.exception.NotEligibleForDoseException;
//import com.example.dosify.exception.UserNotFoundException;
//import com.example.dosify.repository.DoctorRepository;
//import com.example.dosify.repository.UserRepository;
//import com.example.dosify.service.Dose1Service;
//import com.example.dosify.service.Dose2Service;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.Optional;
//import java.util.UUID;
//
//public class AppointmentTransfer {
//    @Autowired
//    static
//    UserRepository userRepository;
//    @Autowired
//    static
//    DoctorRepository doctorRepository;
//    @Autowired
//    static
//    Dose1Service dose1Service;
//
//    @Autowired
//    static
//    Dose2Service dose2Service;
//    public static Appointment appointmentRequestDtoToappointment(AppointmentRequestDto appointmentRequestDto) throws UserNotFoundException, DoctorNotFoundException, NotEligibleForDoseException {
////        Optional<User> optionalUser = userRepository.findById(appointmentRequestDto.getUserId());
////        if(!optionalUser.isPresent()){
////            throw new UserNotFoundException("User doesn't exist!");
////        }
////        Optional<Doctor> optionalDoctor = doctorRepository.findById(appointmentRequestDto.getDoctorId());
////        if(!optionalDoctor.isPresent()){
////            throw new DoctorNotFoundException("Doctor doesn't exist!!!");
////        }
////        User user = optionalUser.get();
////        Doctor doctor = optionalDoctor.get();
////        if(appointmentRequestDto.getDoseNo()== DoseNo.DOSE_1){
////            // Dose1Service dose1Service;
////            Dose1 dose1 = dose1Service.createDose1(user,appointmentRequestDto.getVaccineType());
////            user.setDose1Taken(true);
////            user.setDose1(dose1);
////        }
////        else{
////            // DOSE_2
////            if(!user.isDose1Taken()){
////                throw new NotEligibleForDoseException("Sorry! You are not yet eligible for Dose 2");
////            }
////
////            Dose2 dose2 = dose2Service.createDose2(user,appointmentRequestDto.getVaccineType());
////            user.setDose2Taken(true);
////            user.setDose2(dose2);
////        }
////        Appointment appointment = Appointment
//        return Appointment.builder()
//                .appointmentNo(String.valueOf(UUID.randomUUID()))
//                .doseNo(appointmentRequestDto.getDoseNo())
//                .user(appointmentRequestDto.getUserId())
//                .doctor(appointmentRequestDto.getDoctorId())
//                .build();
////        user.getAppointments().add(appointment);
////        User savedUser = userRepository.save(user); // save dose1/dose2 and appointment
////
////        Appointment savedAppointment = savedUser.getAppointments().get(savedUser.getAppointments().size()-1);
////        doctor.getAppointments().add(savedAppointment);
////        doctorRepository.save(doctor);
////    }
//    public static AppointmentResponseDto AppointmentToAppointmentResponseDto(AppointmentResponseDto appointmentResponseDto) {
//        return AppointmentResponseDto.builder()
//                .userName(appointmentResponseDto.getUserName())
//                .appointmentNo(appointmentResponseDto.getAppointmentNo())
//                .dateOfAppointment(appointmentResponseDto.getDateOfAppointment())
//                .doseNo(appointmentResponseDto.getDoseNo())
//                .centerResponseDto(appointmentResponseDto.getCenterResponseDto())
//                .doctorName(appointmentResponseDto.getDoctorName())
//                .vaccineType(appointmentResponseDto.getVaccineType())
//                .build();
//    }
//}
