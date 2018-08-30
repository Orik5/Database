package com.lviv.dvoretskyi.databasestudents.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table
public class TemplateChecklist {

  @javax.persistence.Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int Id;
  @Column()
  private Template template;

}
