package com.spring.beans;

public class Sword implements Weapon {
    @Override
    public void attack(){
        System.out.println("slice");
    };
}
