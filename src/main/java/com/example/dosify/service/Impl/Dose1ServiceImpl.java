package com.example.dosify.service.Impl;

import com.example.dosify.Enum.VaccinationType;
import com.example.dosify.Model.Dose1;
import com.example.dosify.Model.User;
import com.example.dosify.service.Dose1Service;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class Dose1ServiceImpl implements Dose1Service {
    @Override
    public Dose1 createDose1(User user, VaccinationType vaccineType) {
        Dose1 dose1 = Dose1.builder()
                .doseId(String.valueOf(UUID.randomUUID()))
                .vaccineType(vaccineType)
                .user(user)
                .build();

        return dose1;

    }
}
