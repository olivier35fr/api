package com.olivier.api.service;

import com.olivier.api.model.Employee;
import com.olivier.api.repository.EmployeeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Data
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployee(final Long id){
        return employeeRepository.findById(id);
    }

    public List<Employee> getEmployees(){
        return (List) employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee){
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;
    }

}
