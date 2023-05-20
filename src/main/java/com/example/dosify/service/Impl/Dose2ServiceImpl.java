package com.example.dosify.service.Impl;

import com.example.dosify.Enum.VaccinationType;
import com.example.dosify.Model.Dose2;
import com.example.dosify.Model.User;
import com.example.dosify.service.Dose2Service;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service

public class Dose2ServiceImpl implements Dose2Service {
    @Override
    public Dose2 createDose2(User user, VaccinationType vaccineType) {
        Dose2 dose2 = Dose2.builder()
                .doseId(String.valueOf(UUID.randomUUID()))
                .vaccineType(vaccineType)
                .user(user)
                .build();
        return dose2;

    }
}
