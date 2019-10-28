import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Player extends GameObject{

boolean up = false;
boolean down = false;
boolean left =false;
boolean right = false;
public static BufferedImage image;
public static boolean needImage = true;
public static boolean gotImage = false;	
Player(int x, int y, int width, int height){
	super(x,y,width,height); 
	if (needImage) {
	    loadImage ("steve.png");
	}

}
void draw(Graphics g){
	if (gotImage) {
		g.drawImage(image, x, y, 100, 100, null);
	} else {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}


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
void loadImage(String imageFile) {
    if (needImage) {
        try {
            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
	    gotImage = true;
        } catch (Exception e) {
            
        }
        needImage = false;
    }
}
public Arrows getProjectile() {
        return new Arrows(x+width/2, y, 40, 40);
} 

}

