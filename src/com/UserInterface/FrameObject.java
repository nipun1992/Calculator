package com.UserInterface;

import java.awt.Color;
import java.awt.Frame;

import com.FrameTypes.BlueFrame;

public class FrameObject {

	static Frame f;

	// Constructing a f
	public static Frame createFrame(String name, boolean visibility, int width, int height, Color color) {
		f = new BlueFrame(name, visibility, width, height, color);
		return f;
	}

}
