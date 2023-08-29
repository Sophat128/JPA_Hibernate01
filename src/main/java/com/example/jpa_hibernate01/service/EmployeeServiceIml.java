package com.example.jpa_hibernate01.service;

import com.example.jpa_hibernate01.entities.Employee;
import com.example.jpa_hibernate01.repository.EmployeeRepository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class EmployeeServiceIml implements EmployeeService{
    private final EmployeeRepository employeeRepository;

    @Override
    public void saveData(Employee employee) {
        employeeRepository.saveData(employee);
    }

    @Override
    public void merge(Employee employee) {
        employeeRepository.merge(employee);
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public String deleteEmployee(Long id) {
        Employee employeeToDelete = findById(id);
        if(employeeToDelete != null){
        employeeRepository.deleteEmployee(employeeToDelete);
        return "Deleted Successfully";

        }
        return "This employee doesn't exist!";
    }
}
