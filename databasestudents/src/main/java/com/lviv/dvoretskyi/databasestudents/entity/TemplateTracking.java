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
@Table(name = "templateTracking")
public class TemplateTracking {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private int id;
  @ManyToOne
  @JoinColumn(name = "templateId")
  Template template;
  @OneToMany(mappedBy = "templateTracking")
  List<TemplateTrackingEmployee>templateTrackingEmployees;

  public TemplateTracking() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Template getTemplate() {
    return template;
  }

  public void setTemplate(Template template) {
    this.template = template;
  }

  public List<TemplateTrackingEmployee> getTemplateTrackingEmployees() {
    return templateTrackingEmployees;
  }

  public void setTemplateTrackingEmployees(
      List<TemplateTrackingEmployee> templateTrackingEmployees) {
    this.templateTrackingEmployees = templateTrackingEmployees;
  }
}
