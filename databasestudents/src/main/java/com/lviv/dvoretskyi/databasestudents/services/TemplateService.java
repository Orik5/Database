package com.lviv.dvoretskyi.databasestudents.services;

import com.lviv.dvoretskyi.databasestudents.entity.Template;

public interface TemplateService {

  void add(String city, String email, String login, int storageTime);

  void edit(int id,String city, String email, String login, int storageTime);

  void delete(int id);

 Template findById(int id);
}
