package com.skillstorm;

//import the gui tookits
import java.awt.*;
import javax.swing.*;

public class Example1 {
    public static void main(String[] args) {
        // String name = JOptionPane.showInputDialog("What is your name? ");
        // JOptionPane.showMessageDialog(null, "Hello, " + name + "!");

        //Prompt user for temp and convert to degC
        String response = JOptionPane.showInputDialog("What is the temp in Fahrenheit? ");
        double temp = Double.parseDouble(response);
        temp = convertTempFtoC(temp);
        JOptionPane.showMessageDialog(null, String.format("The temperature in deg Celsius is %.1f%s" , temp , "!"));

    }

    public static double convertTempFtoC(double temp){
        // The formula degC = (degF - 32) * 5/9
        return (temp - 32) * 5.0/9.0;
    }

}
