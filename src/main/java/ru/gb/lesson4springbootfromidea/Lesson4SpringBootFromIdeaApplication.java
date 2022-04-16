package ru.gb.lesson4springbootfromidea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import ru.gb.lesson4springbootfromidea.config.ProductProps;

@EnableConfigurationProperties(ProductProps.class)
@SpringBootApplication
public class Lesson4SpringBootFromIdeaApplication {

    public static void main(String[] args) {

        SpringApplication.run(Lesson4SpringBootFromIdeaApplication.class, args);
    }



}
