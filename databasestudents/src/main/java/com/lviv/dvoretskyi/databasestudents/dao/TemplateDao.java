package com.lviv.dvoretskyi.databasestudents.dao;

import com.lviv.dvoretskyi.databasestudents.entity.Template;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateDao extends JpaRepository<Template, Object> {

  void add(Template template);

  void edit(Template template);

  void delete(Template template);

  Template findById(int id);
}
