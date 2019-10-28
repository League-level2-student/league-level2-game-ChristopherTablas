import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener{
Player alex;
ArrayList<Arrows> ar = new ArrayList<Arrows>();
ArrayList<Zombies> zom = new ArrayList<Zombies>();

ObjectManager(Player alex){
	this.alex = alex;
	addZombies(new Zombies(500,new Random().nextInt(Game.height),80,80));
}
void addProjectile(Arrows proj){
	ar.add(proj);
}
void addZombies(Zombies zomb){
	zom.add(zomb);
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
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
