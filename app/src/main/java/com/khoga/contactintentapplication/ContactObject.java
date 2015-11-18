package com.khoga.contactintentapplication;

import java.io.Serializable;

/**
 * Created by Portal1 on 18/11/2015.
 */
public class ContactObject implements Serializable {

    private static final long serialVersionUID = 1L;
    private String Name;
    private String Phone;
    private String Email;
    private String Website;

    public ContactObject(String name, String phone, String email, String website){
        super();
        Name = name;
        Phone = phone;
        Email = email;
        Website = website;
    }

    public String getName() {
        return Name;
    }

    public String getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }

    public String getWebsite() {
        return Website;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setWebsite(String website) {
        Website = website;
    }
}
