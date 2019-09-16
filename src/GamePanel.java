import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	int currentState= MENU;
	Font titlefont;
	Font littlefont;
	Timer frameDraw;
	GamePanel(){
	frameDraw = new Timer(1000/60,this);
	frameDraw.start();
	 titlefont = new Font("Arial", Font.PLAIN, 48);
	 littlefont = new Font("Arial", Font.PLAIN, 24);

}
	@Override
	public void paintComponent(Graphics g){
	if(currentState == MENU){
		drawMenuState(g);
}else if(currentState == GAME){
    drawGameState(g);
}else if(currentState == END){
    drawEndState(g);
}
	}
	void updateMenuState(){
		
	}

	void updateGameState(){
		
	}

	void updateEndState(){
		
	}
	void drawMenuState(Graphics g) {  
		g.setColor(Color.blue);
		g.fillRect(0, 0,Game.width, Game.height);
		g.setFont(titlefont);
		g.setColor(Color.YELLOW);
		g.drawString("Zombies!!!", 280, 50);
		g.setFont(littlefont);
		g.drawString("Press ENTER to start", 280, 180);
		g.drawString("Press SPACE for instructions", 250, 350);
		
	}
	void drawGameState(Graphics g) {  
		g.setColor(Color.green);
		g.fillRect(0, 0,Game.width, Game.height);
	}
	void drawEndState(Graphics g)  {  
		g.setColor(Color.RED);
		g.fillRect(0, 0,Game.width, Game.height);
		g.setFont(titlefont);
		g.setColor(Color.YELLOW);
		g.drawString("GAME OVER", 280, 50);
		g.setFont(littlefont);
		g.drawString("You killed Zombies", 320, 180);
		g.drawString("Press ENTER to restart", 305, 350);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("action");
		repaint();
		if(currentState == MENU){
    updateMenuState();
}else if(currentState == GAME){
    updateGameState();
}else if(currentState == END){
    updateEndState();
}
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyCode()==KeyEvent.VK_ENTER) {
    if (currentState == END) {
        currentState = MENU;
    } else {
        currentState++;
    }
}
	if (arg0.getKeyCode()==KeyEvent.VK_UP) {
		System.out.println("UP");
}   	
	if (arg0.getKeyCode()==KeyEvent.VK_DOWN) {
		System.out.println("DOWN");
}   	
	if (arg0.getKeyCode()==KeyEvent.VK_LEFT) {
		System.out.println("LEFT");
}   
	if (arg0.getKeyCode()==KeyEvent.VK_RIGHT) {
	    System.out.println("RIGHT");
	}   
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}
