package maze;

import java.awt.Color;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FieldPanel extends JPanel {
private static final long serialVersionUID = 1L;
	
	JLabel gameLabel;
	Map map;
	
	public FieldPanel() {
		// サイズは自動調整される
		this.setBackground(Color.orange);
		this.setLayout(null);
	}
	
	public void prepareComponents() {
		gameLabel = new JLabel();
		gameLabel.setText("ゲーム画面");
		gameLabel.setBounds(0, 0, 100, 30);
		gameLabel.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		map = new Map();
		this.add(gameLabel);
	}
}
