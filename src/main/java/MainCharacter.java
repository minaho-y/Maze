import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainCharacter {
	int PosX=295, PosY=110;
	void DrawCharacter(JPanel contentPane) {
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/snans/eclipse-workspace/Game/Images/dog_shibainu_red.png"));
		lblNewLabel.setBounds(PosX, PosY, 16, 16);
		contentPane.add(lblNewLabel);
	}
	
	void actionPerformed(ActionEvent e) {
		System.out.println("ActionListener");
		e.getKeyCode();
	}
}
