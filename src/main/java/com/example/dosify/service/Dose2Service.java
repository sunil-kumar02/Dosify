package com.example.dosify.service;

import com.example.dosify.Enum.VaccinationType;
import com.example.dosify.Model.Dose2;
import com.example.dosify.Model.User;

public interface Dose2Service {
    public Dose2 createDose2(User user, VaccinationType vaccinationType);
}
