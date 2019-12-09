import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener{
Player alex;
ArrayList<Arrows> ar = new ArrayList<Arrows>();
ArrayList<Zombies> zom = new ArrayList<Zombies>();
Random random = new Random();
int score = 0;
ObjectManager(Player alex){
	this.alex = alex;
	

	}
void addProjectile(Arrows proj){
	ar.add(proj);
}
void addZombies(Zombies zomb){
zom.add(zomb);
}
void update(){
	checkCollision();
	purgeObjects();
	getscore();
	for (int i = 0; i < zom.size(); i++) {
		zom.get(i).update();
	}
	for (int j = 0; j < ar.size();j++) {
		ar.get(j).update();
	}
	
}
void draw(Graphics g){
	alex.draw(g);
	for (int i = 0; i < zom.size(); i++) {
		zom.get(i).draw(g);
	}
	for (int i = 0; i < ar.size(); i++) {
		ar.get(i).draw(g);
	}
	
}
void purgeObjects(){
	for (int i = 0; i < zom.size(); i++) {
		if (zom.get(i).isActive == false) {
			zom.remove(i);
		}
	}
	for (int i = 0; i < ar.size(); i++) {
		if (ar.get(i).isActive == false) {
			ar.remove(i);
		}
	}
}
	void checkCollision(){
		for(Zombies z : zom){
			if(alex.collisionBox.intersects(z.collisionBox)){
				alex.isActive = false;
				z.isActive = false;
				
			}
		}
		
		for(Zombies z : zom){
			for(Arrows a: ar){
				if(z.collisionBox.intersects(a.collisionBox)){
					a.isActive = false;
					z.isActive = false;
					score ++;
				}
			}
		}
		
			
	 }
	 int getscore(){
		return score;
	

	}
@Override
public void actionPerformed(ActionEvent e) {
	addZombies(new Zombies(750,new Random().nextInt(Game.height),80,80));
	// TODO Auto-generated method stub
	
}
}
