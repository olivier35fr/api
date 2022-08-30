package com.olivier.api.repository;

import com.olivier.api.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // indique que la class est un bean (fait parti du composant spring) et que son rôle est de communiquer avec la BDD

//CrudRepository: interface fournie par Spring. fourni les méthodes CRUD
public interface EmployeeRepository extends CrudRepository<Employee, Long> {



}
