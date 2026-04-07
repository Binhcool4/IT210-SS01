package org.example.Ex_06;
import org.example.Ex_05.config.AppConfig;
import org.example.Ex_06.service.PlaySessionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PlaySessionService service = context.getBean(PlaySessionService.class);
        service.checkBalance("Huy", 3000);
        service.checkBalance("Huy", 10000);
        service.checkBalance("", 2000);
        service.checkBalance("Huy", -1);
    }
}


