import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
Player alex;
ArrayList<Arrows> ar = new ArrayList<Arrows>();
ArrayList<Zombies> zom = new ArrayList<Zombies>();

ObjectManager(Player alex){
	this.alex = alex;
}
void addProjectile(Arrows proj){
	ar.add(proj);
}
void addZombies(Zombies zomb){
	zom.add(new Zombies(new Random().nextInt(Game.width),0,50,50));
}
void update(){
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
}
