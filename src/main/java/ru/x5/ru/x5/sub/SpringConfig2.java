package ru.x5.ru.x5.sub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig2 {

//  @Autowired
//  Listener l;

  @Bean
  public Listener listener() {
    return new Listener();
  }
}
