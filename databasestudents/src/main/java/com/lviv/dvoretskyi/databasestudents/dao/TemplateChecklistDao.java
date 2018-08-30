package com.lviv.dvoretskyi.databasestudents.dao;

import com.lviv.dvoretskyi.databasestudents.entity.TemplateChecklist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemplateChecklistDao extends JpaRepository<TemplateChecklist, Object> {

  void add(TemplateChecklist templateChecklist);

  void edit(TemplateChecklist templateChecklist);

  void delete(TemplateChecklist templateChecklist);

  TemplateChecklist findById(int id);
}
