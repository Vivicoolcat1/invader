package invader;

import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	GamePanel b;
	static final int WIDTH = 500;
	static final int HEIGHT = 800;

	public static void main(String[] args) {
		LeagueInvaders a = new LeagueInvaders();
		a.setup();

	}

	public LeagueInvaders() {
		frame = new JFrame();
		b = new GamePanel();

	}

	void setup() {
		frame.add(b);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.pack();
		b.startGame();
		frame.addKeyListener(b);
	}
}
