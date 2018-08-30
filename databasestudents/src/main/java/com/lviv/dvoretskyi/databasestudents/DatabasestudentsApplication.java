package com.lviv.dvoretskyi.databasestudents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DatabasestudentsApplication/* extends SpringBootServletInitializer*/ {

  /*@Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(DatabasestudentsApplication.class);
  }*/

  public static void main(String[] args) {
    SpringApplication.run(DatabasestudentsApplication.class, args);
  }
}
