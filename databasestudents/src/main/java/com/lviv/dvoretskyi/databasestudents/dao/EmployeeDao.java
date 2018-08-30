package com.lviv.dvoretskyi.databasestudents.dao;

import com.lviv.dvoretskyi.databasestudents.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Object> {

  void add(Employee employee);

  void edit(Employee employee);

  void delete(Employee employee);

  Employee findById(int id);
}
