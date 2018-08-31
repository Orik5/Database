package com.lviv.dvoretskyi.databasestudents.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private int id;
  @Column
  private String city;
  @Column
  private String email;
  @Column
  private String login;
  @Column
  private int storageTime;
  @OneToMany(mappedBy = "Employee")
  List<TemplateTrackingEmployee>templateTrackingEmployees;

  public Employee() {
  }

  public Employee(int id, String city, String email, String login, int storageTime) {
    this.id = id;
    this.city = city;
    this.email = email;
    this.login = login;
    this.storageTime = storageTime;
  }

  public List<TemplateTrackingEmployee> getTemplateTrackingEmployees() {
    return templateTrackingEmployees;
  }

  public void setTemplateTrackingEmployees(
      List<TemplateTrackingEmployee> templateTrackingEmployees) {
    this.templateTrackingEmployees = templateTrackingEmployees;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public int getStorageTime() {
    return storageTime;
  }

  public void setStorageTime(int storageTime) {
    this.storageTime = storageTime;
  }
}
