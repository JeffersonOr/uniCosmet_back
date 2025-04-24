package com.uniCosmet.uniCosmet.dto;

public class AuthRequest {
    private String nickname;
    private String password;

    
    public AuthRequest(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
