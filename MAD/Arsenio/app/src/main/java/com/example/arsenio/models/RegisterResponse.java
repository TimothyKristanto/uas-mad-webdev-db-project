package com.example.arsenio.models;

import com.google.gson.Gson;

public class RegisterResponse {

    private String name;
    private String email;
    private String password;
    private String confirmPassword;

    public static RegisterResponse objectFromData(String str) {

        return new Gson().fromJson(str, RegisterResponse.class);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
