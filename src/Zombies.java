import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Zombies extends GameObject {
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
Zombies(int x, int y, int width, int height){
	super( x, y, width, height);
	if (needImage) {
	    loadImage ("Zombie.png");
	}
	
}
void update(){
	super.update();
	collisionBox.setBounds(x+30,y,35,83);
	x-=speed;
	
	}
void draw(Graphics g){
	if (gotImage) {
		g.drawImage(image, x, y, width, height, null);
	} else {
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, height);
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
}
