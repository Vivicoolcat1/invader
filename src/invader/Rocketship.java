package invader;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	public void update() {

	}

	public void draw(Graphics g) {
		g.setColor(Color.BLUE);

		g.fillRect(x, y, width, height);

	}

	public Rocketship(int x, int y, int width, int height) {
		super();

	}

}
