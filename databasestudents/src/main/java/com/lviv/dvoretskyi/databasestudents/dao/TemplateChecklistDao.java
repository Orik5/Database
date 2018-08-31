package com.lviv.dvoretskyi.databasestudents.dao;

import com.lviv.dvoretskyi.databasestudents.entity.TemplateChecklist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateChecklistDao extends JpaRepository<TemplateChecklist, Object> {

  void add(TemplateChecklist templateChecklist);

  void edit(TemplateChecklist templateChecklist);

  void delete(TemplateChecklist templateChecklist);

 // TemplateChecklist findById(int id);

  @Query("select employee_id from Employee m where m.employee.email = null ")
  TemplateChecklist findById(int id);
}
