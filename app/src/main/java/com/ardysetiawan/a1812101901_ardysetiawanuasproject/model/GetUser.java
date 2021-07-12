package com.ardysetiawan.a1812101901_ardysetiawanuasproject.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetUser {
    @SerializedName("data")
    List<UserModel> data;
    @SerializedName("total")
    String total;

    public String getTotal() {
        return total;
    }

    public List<UserModel> getData() {
        return data;
    }

    public void setData(List<UserModel> data) {
        this.data = data;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
