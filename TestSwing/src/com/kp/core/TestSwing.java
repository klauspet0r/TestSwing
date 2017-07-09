package com.kp.core;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class TestSwing {

	public static void main(String[] args) {
		
		JPanel pane = new JPanel();
		
		JFrame frame = new JFrame("frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
      //Display the window.
//        frame.pack();
        
        Border blackline;
        
        blackline = BorderFactory.createLineBorder(Color.black);
        
        frame.setSize(400, 225);
        frame.setLocation(100, 100);
        
        Color bgColor = Color.CYAN;
        Color fgColor = Color.BLUE;
        
        
        frame.setForeground(fgColor);
        frame.setVisible(true);
        
        pane.setSize(380, 200);
        pane.setForeground(bgColor);
        pane.setVisible(true);
        
        frame.setContentPane(pane);
        
        
        
        
		
		
		
	}

}
