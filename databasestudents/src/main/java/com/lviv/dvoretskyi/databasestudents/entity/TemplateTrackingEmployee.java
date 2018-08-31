package com.lviv.dvoretskyi.databasestudents.entity;


import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class TemplateTrackingEmployee{
  @Id
  private int id;
  @ManyToOne
  @JoinColumn(name = "templateTrackingId")
  private TemplateTracking templateTracking;
  @ManyToOne
  @JoinColumn(name ="employeeId")
  Employee employee;
  @OneToMany(mappedBy = "templateTrackingEmployee")
  List<TemplateTrackingEmployee>templateTrackingEmployees;
  boolean resultOfTracking;

  public TemplateTrackingEmployee() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public TemplateTracking getTemplateTracking() {
    return templateTracking;
  }

  public void setTemplateTracking(
      TemplateTracking templateTracking) {
    this.templateTracking = templateTracking;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public boolean isResultOfTracking() {
    return resultOfTracking;
  }

  public void setResultOfTracking(boolean resultOfTracking) {
    this.resultOfTracking = resultOfTracking;
  }
}
