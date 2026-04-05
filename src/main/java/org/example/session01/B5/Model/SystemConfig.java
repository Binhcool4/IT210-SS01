package org.example.session01.B5.Model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class SystemConfig {
    @Value("LPL")
    private String branchName;

    @Value("12")
    private int openingHour;

    public String getBranchName() {
        return branchName;
    }

    public int getOpeningHour() {
        return openingHour;
    }
}
