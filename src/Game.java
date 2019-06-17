import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game {
	JFrame Frame;
	final int width = 500;
	final int height = 800;
	GamePanel Panel;
	public static void main(String[] args) {
		Game game = new Game();
		game.setup();
	}
	Game(){
		Frame = new JFrame();
		Frame.setSize(width, height);
		Panel = new GamePanel();
	}
	
	void setup(){
		Frame.add(Panel);
		Frame.setVisible(true);
		Frame.getContentPane().setPreferredSize(new Dimension(width, height));
		Frame.addKeyListener(Panel);
        Frame.pack();
        Panel.startGame();
        
	}
}
