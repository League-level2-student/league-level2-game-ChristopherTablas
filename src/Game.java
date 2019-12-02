import javax.swing.JFrame;

public class Game {	
	JFrame frame;
	GamePanel gpan;
	public  final static int width = 850;
	public static final int height = 600;
public static void main(String[] args) {
	Game game = new Game();
	game.setup();
	
}
	Game(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width,height);
gpan = new GamePanel();
	}
	void setup(){
		frame.add(gpan);
		frame.addKeyListener(gpan);
		frame.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}
}
