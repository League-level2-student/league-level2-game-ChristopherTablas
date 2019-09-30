import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject{
	
Player(int x, int y, int width, int height){
	super(x,y,width,height); 

}
void draw(Graphics g){
	g.setColor(Color.BLUE);
	g.fillRect(x, y, width, height);


}
public void right(){
	x+=speed;
	if(x>740){
		x-=speed;
	}
}
public void left(){
	x-=speed;
	if(x<0){
		x+=speed;
	}
}
public void up(){
	y-=speed;
	if(y<0){
		y=y+speed;
	}
}
public void down(){
	y+=speed;
	if(y>425){
		y= y - speed;
	}	
	}

}

