package com.ardysetiawan.a1812101901_ardysetiawanuasproject.model;

import com.google.gson.annotations.SerializedName;

public class PostPutDelUser {
    @SerializedName("status")
    String status;
    @SerializedName("result")
    UserModel user;
    @SerializedName("message")
    String message;

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    public UserModel getUser() {
        return user;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }
}
