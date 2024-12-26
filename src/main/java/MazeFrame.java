

import java.awt.event.*;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MazeFrame extends JFrame{
	public MazePanel panel;
	
	public MazeFrame() {
		panel = new MazePanel();
//		MazeGame mazeGame = new MazeGame();
		
		this.add(panel);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				super.windowClosed(e);
				MazeGame.loop = false;
			}
		});
		
		this.addKeyListener(new Keyboard());
		
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setTitle("Maze");
		this.setSize(MazeGame.screenWidth, MazeGame.screenWidth);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}
}
