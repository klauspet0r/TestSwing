package com.kp.core;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class TestSwing {

	public static void main(String[] args) {
		
		//Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        label.setFont(new Font("Serif", Font.PLAIN, 28));
        
        label.setHorizontalAlignment(0);
        frame.getContentPane().add(label);
        
        
 
        //Display the window.
        frame.pack();
        frame.setLocation(800, 500);
        frame.setSize(400, 225);
        frame.setVisible(true);

	}

}

/*
 * 
 * */
