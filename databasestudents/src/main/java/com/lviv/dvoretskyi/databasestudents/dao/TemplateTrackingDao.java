package com.lviv.dvoretskyi.databasestudents.dao;

import com.lviv.dvoretskyi.databasestudents.entity.TemplateTracking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateTrackingDao extends JpaRepository<TemplateTracking, Object> {

  void add(TemplateTracking templateTracking);

  void edit(TemplateTracking templateTracking);

  void delete(TemplateTracking templateTracking);

  TemplateTracking findById(int id);
}
