package com.developer.harry.passwordcreator;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Harry on 12/1/2016.
 */
public class Password{
    private static String pass="";
    private static String user="";



    public static String getPass(){
        return pass;
    }
    public void setPass(String pass){
        this.pass=pass;
        System.out.println("Password="+pass);
    }
    public static String getUser(){
        return user;
    }
    public void setUser(String user){
        this.user=user;
        System.out.println("User="+user);
    }
    public void write(){

    }
}
