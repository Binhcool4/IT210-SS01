package org.example.session01.THTH;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PlaySessionService {
    private final AlertService alertService;

    public PlaySessionService(@Qualifier("soundAlert") AlertService alertService) {
        this.alertService = alertService;
    }
    public void checkBalance(String name, double balance) {

        if (name == null || name.trim().isEmpty()) {
            System.out.println("Name không hợp lệ");
            return;
        }

        if (balance < 0) {
            System.out.println("Balance lỗi (âm)");
            return;
        }

        if (balance < 5000) {
            alertService.alert(name, balance);
        } else {
            System.out.println("Tài khoản " + name + " vẫn đủ tiền: " + balance);
        }
    }

}
