package invader;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame ;
	LeagueInvaders a = new LeagueInvaders();
	int width = 500;
	int height = 800;
public  static void main(String[] args) {
	setup(a);
}
public void LeaugeInvaders() {
	frame=new JFrame();
	
	
}
void setup() {
	
	frame.setSize(width, height);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
}
