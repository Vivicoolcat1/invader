package invader;

import java.awt.Graphics;

public class ObjectManager {
	Rocketship r;
	public ObjectManager(Rocketship rocket) {
		r = rocket;	}
void update() {
	r.update();
}
void draw(Graphics g) {
	r.draw(g);
}
	
}
