package com.lviv.dvoretskyi.databasestudents.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "template")

public class Template {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private int id;
  @Column
  private int name;
  @Column(name = "createdby")
  private String CreatedBy;
  @OneToMany(mappedBy = "template")
  private List<TemplateChecklist> templateChecklistList;
  @OneToMany(mappedBy = "template")
  private List<TemplateTracking>templateTrackings;

  public Template(int name, String createdBy) {
    this.name = name;
    CreatedBy = createdBy;
  }
  public Template() {
  }

  public List<TemplateTracking> getTemplateTrackings() {
    return templateTrackings;
  }

  public void setTemplateTrackings(
      List<TemplateTracking> templateTrackings) {
    this.templateTrackings = templateTrackings;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  public List<TemplateChecklist> getTemplateChecklistList() {
    return templateChecklistList;
  }

  public void setTemplateChecklistList(
      List<TemplateChecklist> templateChecklistList) {
    this.templateChecklistList = templateChecklistList;
  }
}
