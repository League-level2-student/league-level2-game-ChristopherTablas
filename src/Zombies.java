import java.awt.Color;
import java.awt.Graphics;

public class Zombies extends GameObject {
Zombies(int x, int y, int width, int height){
	super( x, y, width, height);
}
void update(){
	x-=speed;
	}
void draw(Graphics g){
	g.setColor(Color.yellow);
	g.fillRect(x,y,width,height);
}
}
