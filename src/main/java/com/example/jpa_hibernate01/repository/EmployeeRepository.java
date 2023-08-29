package com.example.jpa_hibernate01.repository;
import com.example.jpa_hibernate01.entities.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    @PersistenceContext
    private EntityManager em;
    @Transactional
    public void saveData(Employee employee) {
        em.persist(employee);
    }
    @Transactional
    public void merge(Employee employee) {
        em.detach(employee);
        employee.setFirstName("new Data");
        em.merge(employee);
        em.flush();
    }
    @Transactional
    public Employee findById(Long id){
       return em.find(Employee.class, id);
    }
    @Transactional
    public void deleteEmployee(Employee employee){
        em.remove(employee);
    }
}
