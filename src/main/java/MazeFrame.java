import java.awt.event.*;

import javax.swing.*;

public class MazeFrame extends JFrame{
	public MazePanel panel;
	
	public MazeFrame() {
		panel = new MazePanel();
		
		this.add(panel);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				super.windowClosed(e);
				Maze.loop = false;
			}
		});
	}
}
