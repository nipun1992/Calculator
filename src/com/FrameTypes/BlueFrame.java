package com.FrameTypes;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import com.Listener.WindowListenerAdapter;
import com.Listener.WindowListenerImplementation;

//Class representing a kind of Frame
public class BlueFrame extends Frame implements ActionListener {

	Label l1, l2;
	TextField tf1, tf2, tf3;
	Button b1, b2, b3;

	// Constructor of the blueFrame
	public BlueFrame(String name, boolean visibility, int width, int height, Color color) {

		// setting the name of the BlueFrame object
		this.setTitle(name);

		// Making the current frame visible
		this.setVisible(visibility);

		// Setting the size of the current frame
		this.setSize(width, height);

		// Setting the background color of the current frame
		this.setBackground(color);

		// this.addWindowListener(new WindowListenerImplementation());

		// this.addWindowListener(new WindowListenerAdapter());

		this.addWindowListener(new WindowListenerAdapter() {
			public void windowClosing(WindowEvent e) {
				// System.out.println("window Closing");
				System.exit(0);
			}
		});

		this.setLayout(new FlowLayout());

		l1 = new Label("Enter first number");
		l2 = new Label("Enter second number");
		
		tf1 = new TextField(5);
		tf2 = new TextField(5);

		b1 = new Button("Add");
		b2 = new Button("Subtract");

		b1.setBackground(Color.RED);
		b2.setBackground(Color.BLUE);

		/*
		 * b1.setLocation(100, 100); b2.setSize(110,100);
		 */

		Font font = new Font("arial", Font.ITALIC, 40);
		l1.setFont(font);
		l2.setFont(font);
		tf1.setFont(font);
		tf2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b1.addActionListener(this);
		b2.addActionListener(this);

		this.add(l1);
		this.add(l2);
		this.add(tf1);
		this.add(tf2);
		this.add(b1);
		this.add(b2);

		

	}

	// Overriding paint() method to display text on the Frame
	
	  public void paint(Graphics g) {
	  
	  // Creating a Font object 
	   Font font = new Font("arial", Font.ITALIC, 40);
	  
	  // Setting the foreground color this.setForeground(Color.yellow);
	  g.setFont(font);
	  
	  // Writing a text on the foreground and aligning it
	  //g.drawString("Basic Calculator", 250, 80); 
	  }
	 

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		String res = ae.getActionCommand();
		
		System.out.println(res);

	}

}
