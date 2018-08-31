package com.lviv.dvoretskyi.databasestudents.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "templateChecklist")
public class TemplateChecklist {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @ManyToOne
  @JoinColumn(name = "templateId")
  private Template template;
  private String skype;
  private String mobile;

  public TemplateChecklist(String skype, String mobile) {
    this.skype = skype;
    this.mobile = mobile;
  }

  public TemplateChecklist() {
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

  public String getSkype() {
    return skype;
  }

  public void setSkype(String skype) {
    this.skype = skype;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }
}
