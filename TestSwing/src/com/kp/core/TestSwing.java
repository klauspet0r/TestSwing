package com.kp.core;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class TestSwing {

	public static void main(String[] args) {
		
		//Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
        
        
        
        
		
		
		
	}

}
