import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainCanvas {
	public int[][] data = new int[][] {
		{1,1,1,1,0,1,1,1},
		{1,0,0,1,0,1,0,1},
		{1,0,1,1,0,0,0,1},
		{1,0,0,0,1,0,1,1},
		{1,1,1,0,1,0,0,1},
		{1,0,1,0,1,1,0,1},
		{1,0,0,0,0,0,0,1},
		{1,1,1,0,1,1,1,1}
	};
	
	// コンストラクタ
	MainCanvas(){
	}
	
	void DrawMap(JPanel contentPane){
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if(data[i][j] == 1) {
					JLabel lblNewLabel = new JLabel("");
					lblNewLabel.setIcon(new ImageIcon("/Users/snans/eclipse-workspace/Game/Images/maptile_renga_brown_02.png"));
					lblNewLabel.setBounds(276 + j*16, 30 + i*16, 16, 16);
					contentPane.add(lblNewLabel);
				}
			}
		}
	}
}
