package maze;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Map {
	private static final long serialVersionUID = 1L;
	int[][] map = {{1,1,0,1,1},
					{1,0,0,1,1},
					{1,1,0,1,1}};
	int x, y;
	JLabel mapLabel;
	
	Image mapImage;
		
	// コンストラクタ
	Map(){
		// 配列を走査，画像のラベルを生成，パネルにadd
		for (int i=0; i<map.length; i++) {
			for (int j=0; j<map[i].length; j++) {
				switch (map[i][j]) {
				case 0:		// 通路
					mapLabel = new JLabel();
					mapImage = new ImageIcon(getClass().getClassLoader().getResource("maptile_koya.png")).getImage();
					mapLabel.setSize(mapImage.getWidth(null), mapImage.getHeight(null));
//					setLocation(100+i, 100+j);
//					this.setBounds(100+i, 100+j, mapImage.getWidth(null), mapImage.getHeight(null));
					x = 100 + i*16;
					y = 100 + j*16;
					mapLabel.setLocation(x, y);
					break;
				case 1:		// 壁
					break;
				}
			}
		}
	}
}
