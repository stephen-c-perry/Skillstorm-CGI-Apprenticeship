package com.skillstorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.skillstorm.beans.Weapon;

public class Main2 {

    public static void main(String[] args) {
        // Get the application context using the Java config file
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Weapon weapon = (Weapon) ctx.getBean("weapon");
        weapon.attack();
    }
    
}
