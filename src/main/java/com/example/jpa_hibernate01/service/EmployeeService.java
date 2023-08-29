package com.example.jpa_hibernate01.service;

import com.example.jpa_hibernate01.entities.Employee;

public interface EmployeeService {
    void saveData(Employee employee);
    void merge(Employee employee);
    Employee findById(Long id);

    String deleteEmployee(Long id);
}
