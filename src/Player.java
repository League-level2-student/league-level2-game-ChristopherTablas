import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject{

boolean up = false;
boolean down = false;
boolean left =false;
boolean right = false;
Player(int x, int y, int width, int height){
	super(x,y,width,height); 

}
void draw(Graphics g){
	g.setColor(Color.BLUE);
	g.fillRect(x, y, width, height);


}
void update(){
	if(up == true){
		y-=speed;
	}
	if(down == true){
		y+=speed;
	}
	if(left == true){
		x-=speed;
	}
	if(right == true){
		x+=speed;
	}

}

}

