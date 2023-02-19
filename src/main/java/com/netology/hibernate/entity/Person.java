package com.netology.hibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PERSONS")
public class Person {
    @EmbeddedId
    private PersonId personId;
    @Column(name = "phone_number", length = 25)
    private String phoneNumber;
    @Column(name = "city", length = 100)
    private String city;
}
