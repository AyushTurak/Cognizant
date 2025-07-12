package com.ishanya.employee.service;

import com.ishanya.employee.model.Employee;
import com.ishanya.employee.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee getEmployeeByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }

    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }
}