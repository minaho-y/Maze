import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Maze{

	private static final long serialVersionUID = 1L;
	public static MazeFrame mazeFrame;
	public static boolean loop;
	
	// SCREEN
	static int screenWidth = 500;
	static int screenHeight = 500;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maze maze = new Maze();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Maze() {
		loop = true;
		mazeFrame = new MazeFrame();
		
		Graphics gra = mazeFrame.panel.image.getGraphics();

		
		// FPS
		long startTime;
		long fpsTime = 0;
		int fps = 30;
		int FPS = 0;
		int FPSCount = 0;
		
		while(loop) {
			// FPSを計測
			if ((System.currentTimeMillis() - fpsTime) >= 1000) {
				fpsTime = System.currentTimeMillis();
				FPS = FPSCount;
				FPSCount = 0;
				System.out.println(FPS);
			}
			FPSCount++;
						
			startTime = System.currentTimeMillis();
			
			gra.setColor(Color.WHITE);
			gra.fillRect(0, 0, screenWidth, screenHeight);
			
			gra.setColor(Color.BLACK);
			Font font = new Font("SansSerif", Font.PLAIN, 40);
			gra.setFont(font);
			FontMetrics metrics = gra.getFontMetrics(font);
			gra.drawString("Shooting", 250 - metrics.stringWidth("Shooting") / 2, 80);
			
			// FPSを画面に表示
			gra.setColor(Color.BLACK);
			gra.setFont(new Font("SansSerif", Font.PLAIN, 10));
			gra.drawString(FPS + "FPS", 2, 460);
			
			// パネルを表示
			mazeFrame.panel.repaint();
			
			try {
				long runTime = System.currentTimeMillis() - startTime;
				if (runTime < (1000/fps)) {
					Thread.sleep(1000 / fps -runTime);
				}
							
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 800, 560);
//		contentPane = new JPanel();
		
//		mazeFrame.panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
//		MainCanvas canvas = new MainCanvas();
		// マップを描画
//		canvas.DrawMap(contentPane);
		
//		MainCharacter chara = new MainCharacter();
		// キャラクターを描画
//		chara.DrawCharacter(contentPane);
		
		// アクションリスナーを追加
//		addKeyListener(chara);
		
		
//		setContentPane(contentPane);
//		contentPane.setLayout(null);		
	}
}


