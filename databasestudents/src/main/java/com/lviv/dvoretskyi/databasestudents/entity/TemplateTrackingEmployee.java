package com.lviv.dvoretskyi.databasestudents.entity;


import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TemplateTrackingEmployee {

  @Id
  private int id;


  @OneToMany
  private List<Template> templateList;



}
