package com.Listener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowListenerAdapter extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		 System.out.println("window Closing");
		System.exit(0);
	}
}
