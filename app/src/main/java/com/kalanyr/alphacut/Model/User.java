package com.kalanyr.alphacut.Model;

public class User {
    private String name,address,phonenumber;

    public User(){

    }

    public User(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phonenumber = phoneNumber;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
