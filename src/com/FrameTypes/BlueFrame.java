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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.Listener.WindowListenerAdapter;
import com.Listener.WindowListenerImplementation;

//Class representing a kind of Frame
public class BlueFrame extends Frame implements ActionListener {

	int res;
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

		// Setting the layout of the Frame
		this.setLayout(new FlowLayout());

		// Setting the background color of the current frame
		this.setBackground(color);

		// this.addWindowListener(new WindowListenerImplementation());

		// this.addWindowListener(new WindowListenerAdapter());

		// Adding WindowListerner implementation the the Frame
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// System.out.println("window Closing");
				System.exit(0);
			}
		});

		// Creating Labels
		l1 = new Label("Enter first number");
		l2 = new Label("Enter second number");

		// Creating TextFields
		tf1 = new TextField(25);
		tf2 = new TextField(25);

		// Creating Buttons
		b1 = new Button("Add");
		b2 = new Button("Subtract");

		// Setting Background colors of the buttons
		b1.setBackground(Color.RED);
		b2.setBackground(Color.BLUE);

		/*
		 * b1.setLocation(100, 100); b2.setSize(110,100);
		 */

		// Creating a Font Style for labels and textfields
		Font font = new Font("arial", Font.ITALIC, 30);

		// Adding font style to labels and textfields
		l1.setFont(font);
		l2.setFont(font);
		tf1.setFont(font);
		tf2.setFont(font);

		// Creating a Font Style for buttons
		Font font2 = new Font("arial", Font.BOLD, 40);
		b1.setFont(font2);
		b2.setFont(font2);

		// Adding ActionListener to the buttons
		b1.addActionListener(this);
		b2.addActionListener(this);

		// Adding GUI components to the Frame
		this.add(l1);
		this.add(tf1);
		this.add(l2);
		this.add(tf2);
		this.add(b1);
		this.add(b2);

	}

	// Overriding paint() method to display text on the Frame
	public void paint(Graphics g) {

		// Creating a Font object
		Font font = new Font("arial", Font.ITALIC, 40);

		// Setting the foreground color
		g.setFont(font);
		// this.setForeground(Color.yellow);

		// Writing a text on the foreground and aligning it
		g.drawString("Result is " + res, 50, 80);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub

		int res1 = 0, res2 = 0;
		try {
			if (!tf1.getText().equals("")) {
				res1 = Integer.parseInt(tf1.getText());
				System.out.print(res1 + "\t");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			if (!tf2.getText().equals("")) {
				res2 = Integer.parseInt(tf2.getText());
				System.out.print(res2 + "\t");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		if (ae.getActionCommand().equals("Add")) {

			res = res1 + res2;
			System.out.println(res);
		}

		if (ae.getActionCommand().equals("Subtract")) {

			res = res1 - res2;
			System.out.println(res);

		}

		repaint();

	}

}
