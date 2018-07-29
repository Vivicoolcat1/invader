package invader;

import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame ;
	GamePanel b;
	int width = 500;
	int height = 800;
public  static void main(String[] args) {
	LeagueInvaders a = new LeagueInvaders();
	a.setup();
	
}
public LeagueInvaders() {
	frame=new JFrame();
	b = new GamePanel();
	
}
void setup() {
	frame.add(b);
	frame.setSize(width, height);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setPreferredSize(new Dimension(width, height));
 frame.pack();
  b.startGame();
  frame.addKeyListener(b);
}
}
