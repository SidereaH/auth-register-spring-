package com.fodi.auth_register.dto;

import lombok.Data;

@Data
public class SignupRequest {
    private String username;
    private String password;
    private String phoneNumber;
}
