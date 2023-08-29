package com.example.jpa_hibernate01.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import java.sql.Date;


@Entity
@Data
@AllArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    @Temporal(TemporalType.DATE)
    private Date bithDate;
    @Transient
    private String temp;
    public Employee() {

    }
}
