package com.example.jpa_hibernate01;

import com.example.jpa_hibernate01.entities.Employee;
import com.example.jpa_hibernate01.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@SpringBootApplication

public class JpaHibernate01Application {



    public static void main(String[] args) {
        SpringApplication.run(JpaHibernate01Application.class, args);
    }

}
