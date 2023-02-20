package com.yyd.helper.common.entity;

import lombok.Data;

@Data
public class User {
    private String username;
    private String password;
    private String nickname;
    private Integer role;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", role=" + role +
                '}';
    }
}
