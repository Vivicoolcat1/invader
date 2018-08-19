package invader;

public class Alien extends GameObject {

	public Alien (int x, int y, int width, int height) {
		super(x,y,width,height);
	}
	public void update() {
		y ++;
	}
	public void draw() {
		
	}
}
