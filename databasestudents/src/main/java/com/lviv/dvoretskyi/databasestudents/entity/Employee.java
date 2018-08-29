package com.lviv.dvoretskyi.databasestudents.entity;

import javax.persistence.Entity;

@Entity

public class Employee {

@javax.persistence.Id

  private int Id;
  private String city;
  private String email;
  private String login;
  private int storageTime;

  public Employee() {
  }

  public Employee(int id, String city, String email, String login, int storageTime) {
    Id = id;
    this.city = city;
    this.email = email;
    this.login = login;
    this.storageTime = storageTime;
  }

  public int getId() {
    return Id;
  }

  public void setId(int id) {
    Id = id;
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
