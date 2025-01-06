import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class MazePanel extends JPanel {
	public BufferedImage image;
	
	public MazePanel() {
		super();
		// 初期化
		this.image = new BufferedImage(Maze.screenWidth, Maze.screenHeight, BufferedImage.TYPE_INT_RGB);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(image, 0, 0, this);
	}
	
	public void draw() {
		this.repaint();
	}
}
