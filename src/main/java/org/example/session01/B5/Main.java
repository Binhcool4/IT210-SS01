package org.example.session01.B5;

import org.example.B5.Model.SystemConfig;
import org.example.B5.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context;

        {
            context = new AnnotationConfigApplicationContext(AppConfig.class);
        }
        SystemConfig config = context.getBean(SystemConfig.class);
        System.out.println("Chi nhánh: " + config.getBranchName() + " - Mở cửa lúc: " + config.getOpeningHour());
    }
}