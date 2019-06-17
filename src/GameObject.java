import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	GameObject(int x, int y, int height, int width){
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}
	void update(){
				
	}
		
	
	void draw(Graphics g){
		  g.setColor(Color.CYAN);
		  g.fillRect(x, y, 20, 20);
	                  

	}
}
