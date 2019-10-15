package com.jfdimarzio.provoking.dao;

import com.android.volley.NoConnectionError;

public class User {
    private String ID;
    private String Title;
    private String Name;
    private String Password;
    private String UID;

    public User(String ID,String title,String name,String password,String UID){
        this.ID=ID;
        this.Title=title;
        this.Name= name;
        this.Password=password;
        this.UID=UID;
    }

    public String getID(){return ID;}

    public String getTitle(){return Title;}

    public String getName(){return Name;}

    public String getPassword(){return Password;}

    public String getUID(){return UID;}
}
