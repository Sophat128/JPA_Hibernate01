package com.example.jpa_hibernate01.controller;

import com.example.jpa_hibernate01.entities.Employee;
import com.example.jpa_hibernate01.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;


@AllArgsConstructor
@RestController
@RequestMapping("/")
public class EmployeeController {
    private final EmployeeService employeeService;
    static Employee employee = Employee.builder()
            .firstName("Dara")
            .lastName("Vann")
            .email("dara@gmail.com")
            .bithDate(new Date(System.currentTimeMillis())).build();
    @GetMapping("/saveData")
    public String insert()
    {
        employeeService.saveData(employee);
        return "Success";
    }
    @GetMapping("/merge")
    public String merge(){
//        Employee employee = Employee.builder()
//                .firstName("Dara")
//                .lastName("Vann")
//                .email("dara@gmail.com")
//                .bithDate(new Date(System.currentTimeMillis())).build();
//        Employee employee = new Employee(null, "Dara", "Sok","dara@gmail.com", new Date(System.currentTimeMillis()), null);

        employeeService.merge(employee);
        return "merge successfully";
    }

    @GetMapping("employee/{id}")
    public String findById(@PathVariable Long id){
        Employee employee = employeeService.findById(id);
        String message;
        if(employee != null){
            message = "Found";
        }else {
            message = "Doesn't exist";
        }
        return message;
    }

    @GetMapping("delete/{id}")
    public String deleteEmployee(@PathVariable Long id){
        return employeeService.deleteEmployee(id);
    }


}
