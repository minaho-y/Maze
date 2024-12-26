import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class SwingSample extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingSample frame = new SwingSample();
					frame.setTitle("Test");
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
	public SwingSample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setBackground(Color.ORANGE);
		
		JButton btnButton1 = new JButton("Hello");
		btnButton1.setBounds(146, 10, 57, 21);
		JButton btnButton2 = new JButton("World!");
		btnButton2.setBounds(208, 10, 63, 21);
		btnButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnButton1);
		contentPane.add(btnButton2);
		
		ImageIcon icon1 = new ImageIcon("/Users/snans/eclipse-workspace/Game/Images/maptile_renga_brown_02.png");
//		setIconImage(icon1.getImage());
		JLabel lblNewLabel = new JLabel(icon1);
		lblNewLabel.setBounds(276, 12, 16, 16);
		lblNewLabel.setBackground(Color.YELLOW);
		contentPane.add(lblNewLabel);
		getContentPane().add(lblNewLabel, BorderLayout.CENTER);
	}
}
