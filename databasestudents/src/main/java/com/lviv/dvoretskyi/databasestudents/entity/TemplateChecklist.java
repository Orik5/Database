package com.lviv.dvoretskyi.databasestudents.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class TemplateChecklist {

  @javax.persistence.Id

  private int Id;
  @Column()
  private Template template;

}
