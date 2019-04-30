package com.FrameTypes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

//Class representing a kind of Frame
public class BlueFrame extends Frame {

	// Constructor of the blueFrame
	public BlueFrame(String name, boolean visibility, int width, int height, Color color) {

		// setting the name of the BlueFrame object
		this.setTitle(name);

		// Making the curren frame visible
		this.setVisible(visibility);

		// Setting the size of the current frame
		this.setSize(width, height);

		// Setting the background color of the current frame
		this.setBackground(color);

	}

	// Overriding paint() method to display text on the Frame
	public void paint(Graphics g) {
		Font font = new Font("arial", Font.ITALIC, 40);
		this.setForeground(Color.yellow);
		g.setFont(font);
		g.drawString("Basic Calculator", 250, 80);
	}

}
