package ru.x5.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);
        while (true) {

        }
    }
}
