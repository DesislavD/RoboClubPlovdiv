package com.example.RoboClubPlovdiv.models;

public enum Role {

    ADMINISTRATOR("ADMINISTRATOR"),STANDARD_USER("STANDARD ROLE"),GUEST("GUEST");

    private String role;
    Role(final String role) {
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}
