package maze;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.lang.reflect.Array;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	// レイアウト
	BorderLayout layout = new BorderLayout();
	
	// コンポーネント
	FieldPanel fieldPanel;
	
	// リスナー
//	MyKeyListener myKeyListener;
	
	GamePanel(){
		this.setLayout(layout);
		this.setBackground(Color.yellow);
		
		// パネル生成と設置
		fieldPanel = new FieldPanel();
		this.add(fieldPanel, BorderLayout.CENTER);
	}
	
	public void prepareComponents() {
		fieldPanel.prepareComponents();
		
		// リスナーを設置
//		myKeyListener = new MyKeyListener(this);
	}

}
