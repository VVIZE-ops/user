package com.userweb.dao;

import javax.xml.crypto.Data;
import java.util.*;

public class Person {
    private int userId;               //用户id
    private String userName;          //用户姓名
    private String userGender;        //用户性别
    private int userIDNuber;          //身份证号码
    private int userPhone;            //手机号
    private Date userBir;             //生日
    private String userHomeAddress;   //家庭住址



    public int getUserId(){
        return userId;
    }
    public void setUserId(int userid){
        this.userId = userid;
    }


    public String getUserName(){
        return userName;
    }
    public void setUserName(String username){
        this.userName=username;
    }


    public String getUserGender(){
        return userGender;
    }
    public void setUserGender(String usergender){
        this.userGender=usergender;
    }


    public int getUserIDNuber(){
        return userIDNuber;
    }
    public void setUserIDNuber(int useridnumber){
        this.userIDNuber=useridnumber;
    }


    public int getUserPhone(){
        return userPhone;
    }
    public void setUserPhone(int userphone){
        this.userPhone=userphone;
    }


    public Date getUserBir(){
        return userBir;
    }
    public void setUserBir(Data userbir){
        this.userBir=userbir;
    }

    public String getUserHomeAddress(){
        return userHomeAddress;
    }
    public void setUserHomeAddress(String userhomeaddress){
        this.userHomeAddress=userhomeaddress;
    }

}
