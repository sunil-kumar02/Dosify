package com.example.dosify.service;

import com.example.dosify.Enum.VaccinationType;
import com.example.dosify.Model.Dose1;
import com.example.dosify.Model.User;

public interface Dose1Service {
    public Dose1 createDose1(User user, VaccinationType vaccinationType);
}
