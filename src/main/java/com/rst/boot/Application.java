package com.rst.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication //to declare spring boot application

public class Application extends SpringBootServletInitializer { //initialize dedicated tomcat initializer

 public static void main(String[] args) {
  ///open nw servlet container host and open tomcat server port
  SpringApplication.run(Application.class,args);
 }

}
