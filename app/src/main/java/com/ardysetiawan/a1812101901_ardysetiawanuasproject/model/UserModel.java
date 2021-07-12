package com.ardysetiawan.a1812101901_ardysetiawanuasproject.model;

import com.google.gson.annotations.SerializedName;

public class UserModel {
    @SerializedName("id")
    private String id;
    @SerializedName("First Name")
    private String firstname;
    @SerializedName("Last Name")
    private String lastname;
    @SerializedName("Email")
    private String email;
    public user(){}
    public user(String id, String firstname, String lastname, String email){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getId(){
        return id;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public String getEmail(){
        return email;
    }
}
