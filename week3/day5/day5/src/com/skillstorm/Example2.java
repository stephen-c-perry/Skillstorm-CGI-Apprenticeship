package com.skillstorm;

import java.awt.*;
import javax.swing.*;

public class Example2 {

    // these are the properties of the class
    static JLabel label = new JLabel("Enter the temperature in degF");
    static JButton button = new JButton();
    static JPanel panel = new JPanel();
    static JTextField text = new JTextField();
    static JFrame frame = new JFrame();

    // this is the main method
    public static void main(String[] args) {
        // frame.setTitle("My first JFrame");
        // frame.setSize(400,400);
        // frame.setVisible(true);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this allows closing with the x button on top right
        MyFrame frame = new MyFrame();
        frame.open();
    }
}
