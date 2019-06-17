import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;


public class GamePanel extends JPanel implements ActionListener, KeyListener{
	Timer time;
	GameObject gobj;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	GamePanel(){
time = new Timer(1000/60, this);
 gobj = new GameObject(10,10,10,10);
			}
	@Override
	public void actionPerformed(ActionEvent arg0) {
	
	gobj.update();
	repaint();
	 if(currentState == MENU_STATE){

         updateMenuState();

 }else if(currentState == GAME_STATE){

         updateGameState();

 }else if(currentState == END_STATE){

         updateEndState();

 }


		// TODO Auto-generated method stub
		
	}
	void startGame(){
		time.start();
	}
	  @Override

	  public void paintComponent(Graphics g){
		gobj.draw(g);
		 if(currentState == MENU_STATE){

             drawMenuState(g);

     }else if(currentState == GAME_STATE){

             drawGameState(g);

     }else if(currentState == END_STATE){

             drawEndState(g);
     }


	          }
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("KeyPressed");
		if(arg0.getKeyCode() == KeyEvent.VK_ENTER){
			currentState = 
			if(currentState > END_STATE){

                currentState = MENU_STATE;

			}
		}
		if(arg0.getKeyCode() == KeyEvent.VK_LEFT){
			
		
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_RIGHT){
			
			
		}
		if(arg0.getKeyCode() == KeyEvent.VK_DOWN){
			
			
		}
		if(arg0.getKeyCode() == KeyEvent.VK_UP){
			
			
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("KeyReleased");
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keytyped");
	}
	void updateMenuState(){
		
	}
	void updateGameState(){
		
	}
	void updateEndState(){
		
	}
	void drawMenuState(Graphics g){
		g.setColor(Color.green);

		g.fillRect(0, 0, 500, 800); 
		
	}
	void drawGameState(Graphics g){
		g.setColor(Color.GREEN);

		g.fillRect(0, 0, 500, 800); 
	}
	void drawEndState(Graphics g){
		g.setColor(Color.RED);

		g.fillRect(0, 0, 500, 800); 
	}
	
}
