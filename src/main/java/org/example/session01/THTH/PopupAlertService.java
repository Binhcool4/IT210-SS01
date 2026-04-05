package org.example.session01.THTH;

import org.springframework.stereotype.Service;

@Service("popupAlert")
public class PopupAlertService implements AlertService {
    @Override
    public void alert(String username, double balance) {
        System.out.println("[POPUP] Tài khoản " + username + " sắp hết tiền: " + balance);
    }
}
