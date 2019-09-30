import java.awt.Color;
import java.awt.Graphics;

public class Arrows extends GameObject{
Arrows(int x, int y, int width, int height){
	super(x,y,width,height);
}
void update(){
	x+=speed;
}
void draw(Graphics g){
	g.setColor(Color.red);
	g.fillRect(x, y, width, height);
}
}
