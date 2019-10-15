package ru.x5.ru.x5.sub;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

  @EventListener
  public void contextStarted(ContextStartedEvent event) {
    System.out.println("context started");
  }

  @EventListener
  public void contextRefreshed(ContextRefreshedEvent event) {
    System.out.println("context refreshed");
  }
}
