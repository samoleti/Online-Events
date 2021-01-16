package com.fmi.online.events.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class DigitalWallet {
    private Long money;

    public DigitalWallet(Long money) {
        this.money = money;
    }

    public DigitalWallet() {
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }
}
