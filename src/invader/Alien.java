package invader;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Alien extends GameObject  {
	boolean moveRight;

	public Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		int direction = new Random().nextInt(2);
		if (direction == 0) {
			moveRight = true;

		} else {
			moveRight = false;
		}
	}

	public void update() {
super.update();
		if (moveRight) {
			y++;

			x++;

			if (x +width> LeagueInvaders.WIDTH) {
				moveRight = false;
			}
		} else {

			x--;

			y++;
			if (x < 0) {
				moveRight = true;
			}
		}
	}

	public void draw(Graphics g) {
		 g.drawImage(GamePanel.alienImg, x, y, width, height, null);
	}
}
