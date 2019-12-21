package com.hyp.learn.async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Arrays;

/**
 * @author hyp
 * Project name is spring-boot-learn
 * Include in com.hyp.learn.qs
 * hyp create at 19-12-21
 **/
@SpringBootApplication
public class AsyncApplication {


    public static void main(String[] args) {

        // 启动Sprign Boot
        ConfigurableApplicationContext ctx = SpringApplication.run(AsyncApplication.class);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}