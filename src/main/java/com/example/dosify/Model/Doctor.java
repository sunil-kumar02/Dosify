package com.example.dosify.Model;

import com.example.dosify.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Doctor {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int id;

        @Column(name="name")
        String name;

        @Column(name="age")
        int age;

        @Column(name = "email_id",unique = true,nullable = false)
        String emailId;

        @Column(name="mob_no",unique = true,nullable = false)
        String mobNo;

        @Column(name="gender")
        @Enumerated(EnumType.STRING)
        Gender gender;

        @OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)//crud operation apply to all the children.
        List<Appointment>appointments = new ArrayList<>();
        @ManyToOne
        @JoinColumn
        VaccinationCenter vaccinationCenter;
    }

