package com.skillstorm;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{

    JLabel label = new JLabel();
    JButton button = new JButton();
    JPanel panel = new JPanel();
    JTextField text = new JTextField();

    public MyFrame(){
        // set the values of the this
        //this is a child class
        this.setTitle("My first JFrame");
        this.setSize(400,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        // Make button pretty
        //button.setSize(100,20); //width and height
        button.setText("Click Me!");
        button.setBounds(150,150,100,20); //x y coordinates and width and height

        // Add the components to the frame
        this.add(label);
        this.add(button);
    }

    public void open() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'open'");
    }
}
