package com.olivier.api.controller;

import com.olivier.api.model.Employee;
import com.olivier.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // comme les autres (component ... indique à spring d'insérer le retour de la méthode au format JSON dans le corps de la requête HTTP
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

}
