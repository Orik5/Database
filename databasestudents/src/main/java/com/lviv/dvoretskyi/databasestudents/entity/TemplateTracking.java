package com.lviv.dvoretskyi.databasestudents.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "templateTracking")
public class TemplateTracking {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private int id;

  private List<Template> templateList;
  private TemplateChecklist templateChecklist;

}
