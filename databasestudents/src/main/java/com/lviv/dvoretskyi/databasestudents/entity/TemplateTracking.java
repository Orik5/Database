package com.lviv.dvoretskyi.databasestudents.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table
public class TemplateTracking {

  @javax.persistence.Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private int Id;
  private Template template;
  private TemplateChecklist templateChecklist;

}
