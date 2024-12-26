/**
 * 
 */
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * 
 */
public class MazeGame {
	
	public static MazeFrame mazeFrame;
	public static boolean loop;
	
	// SCREEN
	static int screenWidth = 500;
	static int screenHeight = 500;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		mazeFrame = new MazeFrame();
		loop = true;
		
		Graphics gra = mazeFrame.panel.image.getGraphics();
		
		// FPS
		long startTime;
		long fpsTime = 0;
		int fps = 30;
		int FPS = 0;
		int FPSCount = 0;
		
		EnumMazeScreen screen = EnumMazeScreen.START;
		
		// GAME
		int playerX = 0, playerY = 0;
		
		while(loop) {
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
			
			switch(screen) {
				case START:
					gra.setColor(Color.BLACK);
					Font font = new Font("SansSerif", Font.PLAIN, 40);
					gra.setFont(font);
					FontMetrics metrics = gra.getFontMetrics(font);
					gra.drawString("Maze", screenWidth/2 - metrics.stringWidth("Maze")/2, 80);
					
					font = new Font("SansSerif", Font.PLAIN, 20);
					gra.setFont(font);
					metrics = gra.getFontMetrics(font);
					gra.drawString("Press SPACE to Start", screenWidth/2 - metrics.stringWidth("Press SPACE to Start")/2, 130);
					
					// GAME画面に遷移
					if (Keyboard.isKeyPressed(KeyEvent.VK_SPACE)) {
						screen = EnumMazeScreen.GAME;
					}
					
					break;
				case GAME:
					MainCanvas mainCanvas = new MainCanvas();
					// マップを描画
					mainCanvas.DrawMap(mazeFrame.panel);
					break;
				case GAMEOVER:
					break;
			}
			// FPSを画面に表示
			gra.setColor(Color.BLACK);
			gra.setFont(new Font("SansSerif", Font.PLAIN, 10));
			gra.drawString(FPS + "FPS", 2, 460);
			
			// パネルを表示
			mazeFrame.panel.draw();
			
			try {
				long runTime = System.currentTimeMillis() - startTime;
				if (runTime < 1000/fps) {
					Thread.sleep(1000/fps - runTime);
				} 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
