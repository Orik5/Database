package com.lviv.dvoretskyi.databasestudents.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "templateChecklist")
public class TemplateChecklist {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @OneToMany
  @JoinTable(name = "group_participant",
      joinColumns = @JoinColumn(name = "group_id"),
      inverseJoinColumns = @JoinColumn(name = "participant_id"))
  private List<Template> templateList;

}
