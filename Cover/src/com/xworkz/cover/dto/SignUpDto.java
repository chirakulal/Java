package com.xworkz.cover.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class SignUpDto implements Serializable {

    private int id;
    private String email;
    private String userId;
    private String password;
    private String confirmPassword;
    private LocalDateTime createdAt;

    public SignUpDto() {
    }

    public SignUpDto(int id, String email, String userId, String password, String confirmPassword, LocalDateTime createdAt) {
        this.id = id;
        this.email = email;
        this.userId = userId;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "SignUpDto{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
