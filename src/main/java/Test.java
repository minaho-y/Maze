//サンプルプログラム

// ライブラリ
import javax.swing.*;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.BorderLayout;

// メインクラス
public class Test {
  public static void main(String[] args) {
	  // ウインドウを生成する
	  
	  EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameWindow gameWindow = new GameWindow("Test", 1280, 720);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
//	  gameWindow.setVisible(true);
    
  }
  
}

// ウインドウ描画クラス
class GameWindow extends JFrame {
  
  public GameWindow(String title, int width, int height) {
	  JFrame frame = new JFrame(title);
	  frame.setBounds(100,100,width,height);
	  frame.setResizable(false);
	  frame.setLocationRelativeTo(null);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  JButton btn = new JButton("Push");
	  
	  frame.getContentPane().add(btn, BorderLayout.NORTH);
	  
	  frame.setVisible(true);
	  
//    // ウインドウ名を設定する
//    super(title);
//    
//    // ウインドウのサイズを設定する
//    setSize(width, height);
//    
//    // ウインドウサイズの変更を禁止する
//    setResizable(false);
//    
//    // ウインドウを画面中央に表示する
//    setLocationRelativeTo(null);
//    
//    // ウインドウを閉じる動作を設定する（「×」ボタンで終了）
//    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  
}
