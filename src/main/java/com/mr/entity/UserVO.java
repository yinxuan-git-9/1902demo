package com.mr.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.io.Serializable;

public class UserVO implements Serializable {

    private Integer userId;
    private String userName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
