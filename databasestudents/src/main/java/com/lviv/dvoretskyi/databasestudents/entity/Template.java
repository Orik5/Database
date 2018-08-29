package com.lviv.dvoretskyi.databasestudents.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "template")

public class Template {

  @javax.persistence.Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private int Id;
  private int name;
  @Column(name = "createdby")
  private String CreatedBy;

  public Template(int name, String createdBy) {
    this.name = name;
    CreatedBy = createdBy;
  }


  public int getId() {
    return Id;
  }

  public void setId(int id) {
    Id = id;
  }

  public int getName() {
    return name;
  }

  public void setName(int name) {
    this.name = name;
  }

  public String getCreatedBy() {
    return CreatedBy;
  }

  public void setCreatedBy(String createdBy) {
    CreatedBy = createdBy;
  }

  public Template() {
  }
}
