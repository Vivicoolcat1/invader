package invader;

import java.awt.Graphics;

public class GameObject {
int x;
int y;
int width;
int height;
	
	
	
	
	
	public GameObject() {
		x=100;
		y = 100;
		width = 50;
		height = 50;
		
	}
	public void update () {
		x++;
		y++;
	}
	public void draw ( Graphics g) {
		 g.fillRect(x, y, 50, 25);   
	}
	
	
}
