
package com.lviv.dvoretskyi.databasestudents.services;

import com.lviv.dvoretskyi.databasestudents.entity.Employee;

public interface EmployeeService {

  void add(String city, String email, String login, int storageTime);

  void edit(int id,String city, String email, String login, int storageTime);

  void delete(int id);

  Employee findById(int id);
}
