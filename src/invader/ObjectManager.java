package invader;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship r;
	long enemyTimer =0;
	int enemySpawnTime=5000;
	public ObjectManager(Rocketship rocket) {
		r = rocket;	}
void update() {
	r.update();
	for (int i = 0; i < p.size(); i++) {
	 p.get(i).update();
	}
	for (int i = 0; i < a.size(); i++) {
		 a.get(i).update();
		}
}
void draw(Graphics g) {
	r.draw(g);
	for (int i = 0; i < p.size(); i++) {
		 p.get(i).draw(g);
		}
	for (int i = 0; i < a.size(); i++) {
		 a.get(i).draw(g);
		}
}
	ArrayList <Projectile> p = new ArrayList<Projectile>();
	
	public void addProjectile(Projectile pro) {
		p.add(pro);
	}
	ArrayList <Alien> a = new ArrayList<Alien>();
	public void addAlien(Alien al) {
		a.add(al);
	}
	public void manageEnemies(){
        if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
                addAlien(new Alien(new Random().nextInt(LeagueInvaders.WIDTH), 0, 50, 50));

enemyTimer = System.currentTimeMillis();
        }
}
	public void purgeObjects() {
		for (int i = 0; i < a.size(); i++) {
			if(a.get(i).isAlive=false) {
				a.remove(i);
		}
			for (int j = 0; j < p.size(); j++) {
				if(p.get(j).isAlive=false) {
					p.remove(j);
			}
		}
	}
	}
	}
