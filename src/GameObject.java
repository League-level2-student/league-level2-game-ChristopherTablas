import java.awt.Rectangle;

public class GameObject {
int x;
int y;
int width;
int height;
int speed = 8;
Rectangle collisionBox;
boolean isActive = true;
	GameObject(int x, int y, int width, int height){
	collisionBox = new Rectangle(x,y,width,height);
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
	
	}
	void update(){
		
	}
}
