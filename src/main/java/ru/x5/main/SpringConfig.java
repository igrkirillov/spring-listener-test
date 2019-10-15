package ru.x5.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.x5.ru.x5.sub.Listener;
import ru.x5.ru.x5.sub.SpringConfig2;

@Configuration
@ComponentScan(basePackages = {"ru.x5.ru.x5.sub", "ru.x5.main"})
public class SpringConfig {
  @Bean
  public SpringConfig2 springConfig2() {
    return new SpringConfig2();
  }

}
