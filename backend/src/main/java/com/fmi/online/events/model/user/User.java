package com.fmi.online.events.model.user;

import com.fmi.online.events.model.digitalwallet.DigitalWallet;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long id2;

    private String firstName;

    private String lastName;

    private String username;

    private String email;

    private String password;

    private DigitalWallet wallet;

    private boolean verificationBadge;

    public User(Long id2, String firstName, String lastName, String username, String email,
                String password, DigitalWallet wallet, boolean verificationBadge) {
        this.id2 = id2;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.wallet = wallet;
        this.verificationBadge = verificationBadge;
    }

    public User() {

    }

    public User(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DigitalWallet getWallet() {
        return wallet;
    }

    public void setWallet(DigitalWallet wallet) {
        this.wallet = wallet;
    }

    public boolean isVerificationBadge() {
        return verificationBadge;
    }

    public void setVerificationBadge(boolean verificationBadge) {
        this.verificationBadge = verificationBadge;
    }
}
