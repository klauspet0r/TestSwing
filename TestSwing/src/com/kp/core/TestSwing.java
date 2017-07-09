package com.kp.core;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class TestSwing {

	public static void main(String[] args) {
		
		//Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        label.setFont(new Font("Serif", Font.PLAIN, 99));
        
        label.setHorizontalAlignment(0);
        frame.getContentPane().add(label);
        
        
        
//        Border raisedbevel = BorderFactory.createRaisedBevelBorder();
        Border raisedbevel = BorderFactory.createLineBorder(Color.black);
        label.setBorder(raisedbevel);
        
        //Display the window.
        frame.pack();
        frame.setLocation(800, 500);
        frame.setSize(label.getSize().width+80, label.getSize().height);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.RED);
        

	}

}

/*
 * 
 * */
