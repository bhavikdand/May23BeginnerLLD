package com.scaler.lld.polymorphism.runtime_polymorphism;

import java.util.Random;

public class Example3 {

    public static User getRandomUser(){
        Random random = new Random();
        int i = random.nextInt();
        if(i%4==0){
            return new Mentor();
        }
        if(i%4==1){
            return new TA();
        }
        if(i%4==2){
            return new Student();
        }
        if(i%4==3){
            return new Instructor();
        }
        return new Mentor();
    }

    public static void main(String[] args) {
        for(int i = 0; i< 50; i++){
            User u = getRandomUser();
            u.login("s");
        }
    }
}

class User{

    void login(){
        System.out.println("Logging in user");
    }

    void login(String s){
        System.out.println("something" + s);
    }


    void renderDashboard(){

    }
}

class Mentor extends User{
    void login(){
        System.out.println("Logging in mentor");
    }
}

class TA extends User{
    void login(){
        System.out.println("Logging in TA");
    }

    void login(String s){
        System.out.println("TA  "+ s);
    }
}

class Student extends User{
    void login(){
        System.out.println("Logging in student");
    }
}

class Instructor extends User{
    void login(){
        System.out.println("Logging in instructor");
    }
}