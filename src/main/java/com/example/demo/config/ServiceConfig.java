package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component

@PropertySource(value = "classpath:persion.properties")
public class ServiceConfig{

  @Value("${example.property}")
  private String exampleProperty="";

  public String getExampleProperty(){
    return exampleProperty;
  }
}
