package maze;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class TitlePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	// コンポーネント
	JLabel title;
	JLabel start;
	JLabel exit;
	JLabel select;
	JLabel message;
	Menu checkMenu = Menu.START;
	Border border = BorderFactory.createLineBorder(Color.BLACK, 2); // いらなければ消す
	MyKeyListener myKeyListener;
	
	// 列挙型
	public enum Menu {
		START,
		EXIT,
	}
	
	// コンストラクタ
	TitlePanel(){
		this.setLayout(null);
		this.setBackground(Color.cyan);
	}
	
	public void prepareComponents() {
		// タイトルロゴ
		title = new JLabel();
		// ImageIcon titlelogo = new ImageIcon(getClass().getClassLoader().getResource("title.png")); // 600x300の画像を指定
		// title.setIcon(titlelogo);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setVerticalAlignment(SwingConstants.BOTTOM);
		title.setText("Created by Me");
		title.setHorizontalTextPosition(JLabel.CENTER);
		title.setVerticalTextPosition(SwingConstants.BOTTOM);
		title.setBounds(90, 0, 600, 350);
		title.setBorder(border);	// 縁取り（いらなければ消す）
	
		//選択肢
		start = new JLabel();
		start.setText("START");
		start.setFont(new Font("MV boil", Font.BOLD, 40));
		start.setHorizontalTextPosition(JLabel.CENTER);
		start.setVerticalTextPosition(JLabel.BOTTOM);
		start.setBounds(330, 400, 150, 40);
		start.setBorder(border);	// 縁取り（いらなければ消す）
	
		//選択肢
		exit = new JLabel();
		exit.setText("EXIT");
		exit.setFont(new Font("MV boil", Font.BOLD, 40));
		exit.setHorizontalTextPosition(JLabel.CENTER);
		exit.setVerticalTextPosition(JLabel.BOTTOM);
		exit.setBounds(330, 450, 110, 40);
		exit.setBorder(border);	// 縁取り（いらなければ消す）
		
		// 選択アイコン
		select = new JLabel();
		select.setBackground(Color.blue);
		select.setOpaque(true);		// 透明にするかどうか
		select.setBounds(280, 400, 40, 40);
		select.setBorder(border);
		
		//選択肢
		message = new JLabel();
		message.setHorizontalAlignment(SwingConstants.CENTER);
		message.setText("選択：↑, ↓		決定：SPACE");
		message.setHorizontalTextPosition(JLabel.CENTER);
		message.setVerticalTextPosition(JLabel.CENTER);
		message.setBounds(249, 517, 300, 30);
		message.setBorder(border);	// 縁取り（いらなければ消す）
		
		// 配置
		this.setLayout(null);
		this.add(title);
		this.add(start);
		this.add(exit);
		this.add(select);
		this.add(message);
		
		// リスナーの設定
		myKeyListener = new MyKeyListener(this);
	}
	
	// 選択の制御
	private class MyKeyListener implements KeyListener {
		// 貼り付け先の保持
		TitlePanel panel;
		
		MyKeyListener(TitlePanel p) {
			super();
			panel = p;
			panel.addKeyListener(this);
		}
		
		@Override
		public void keyTyped(KeyEvent e) {
			// do nothing
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			// do nothing
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
			case KeyEvent.VK_DOWN:
				if(checkMenu == Menu.START) {
					select.setLocation(select.getX(), select.getY() + 50);
					checkMenu = Menu.EXIT;
				}
				break;
			case KeyEvent.VK_UP:
				if(checkMenu == Menu.EXIT) {
					select.setLocation(select.getX(), select.getY() - 50);
					checkMenu = Menu.START;
				}
				break;
			case KeyEvent.VK_SPACE:
				if(checkMenu == Menu.START) {
					// 開始
					Maze.mainWindow.setFrontScreenAndFocus(ScreenMode.GAME);
				} else if (checkMenu == Menu.EXIT){
					// 終了
					System.exit(0);
				}
				break;
			}
		}
	}
}
