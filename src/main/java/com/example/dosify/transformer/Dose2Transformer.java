//package com.example.dosify.transformer;
//
//import com.example.dosify.Model.Dose2;
//import com.example.dosify.dto.RequestDTO.Dose2RequestDto;
//
//import java.util.UUID;
//
//public class Dose2Transformer {
//    public static Dose2 Dose2RequestDtoToDose2(Dose2RequestDto dose2RequestDto){
//        return Dose2.builder()
//                .doseId(String.valueOf(UUID.randomUUID()))
//                .vaccineType(dose2RequestDto.getVaccineType())
//                .user(dose2RequestDto.getUserId())//why red line
//                .build();
//    }
//
//    public static Dose2 Dose2toDose2ResponseDto(Dose2 dose2){
//        return Dose2.builder()
//                .doseId(dose2.getDoseId())
//                .vaccineType(dose2.getVaccineType())
//                .build();
//    }
//}
