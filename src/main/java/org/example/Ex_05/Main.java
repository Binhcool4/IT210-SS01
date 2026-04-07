package org.example.Ex_05;

import org.example.Ex_05.config.AppConfig;
import org.example.Ex_05.model.SystemConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SystemConfig config = context.getBean(SystemConfig.class);

        System.out.println("Branch: " + config.getBranchName());
        System.out.println("Opening hours: " + config.getOpeningHour());
    }
}

