package org.example.session01.THTH;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        PlaySessionService service =
                context.getBean(PlaySessionService.class);

        service.checkBalance("player1", 3000);
        service.checkBalance("vipUser", 10000);
        service.checkBalance("", 2000);
        service.checkBalance("bugUser", -100);
    }
}
