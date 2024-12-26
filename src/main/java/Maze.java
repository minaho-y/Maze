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

public class Maze extends JFrame{

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maze frame = new Maze();
					frame.setVisible(true);
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
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 560);
//		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		MainCanvas canvas = new MainCanvas();
		// マップを描画
		canvas.DrawMap(contentPane);
		
		MainCharacter chara = new MainCharacter();
		// キャラクターを描画
		chara.DrawCharacter(contentPane);
		
		// アクションリスナーを追加
//		addKeyListener(chara);
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);		
	}
}


