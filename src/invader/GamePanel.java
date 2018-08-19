package invader;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer t;
	Font titleFont1;
	Font titleFont2;
	Font titleFont3;
	boolean moveDown;
	boolean moveUp;
	boolean moveLeft;
	boolean moveRight;
	ObjectManager o;
	Rocketship rocket;
	final int MENU_STATE = 0;

	final int GAME_STATE = 1;

	final int END_STATE = 2;

	int currentState = MENU_STATE;
	

	@Override

	public void paintComponent(Graphics g) {

		if (currentState == MENU_STATE) {

			drawMenuState(g);

		} else if (currentState == GAME_STATE) {

			drawGameState(g);

		} else if (currentState == END_STATE) {

			drawEndState(g);

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Test1");
		repaint();
		
		if (currentState == MENU_STATE) {

			updateMenuState();

		} else if (currentState == GAME_STATE) {

			if(moveDown) {
				rocket.y += rocket.speed;
			}
			if(moveUp) {
				rocket.y -= rocket.speed;
			}
			if(moveLeft) {
				rocket.x -= rocket.speed;
			}
			if(moveRight) {
				rocket.x += rocket.speed;
			}
			updateGameState();

		} else if (currentState == END_STATE) {

			updateEndState();

		}

	}

	public GamePanel() {
		t = new Timer(1000 / 60, this);
		titleFont1 = new Font("Ariel", Font.PLAIN, 48);
		titleFont2 = new Font("Ariel", Font.PLAIN, 30);
		titleFont3 = new Font("Ariel", Font.PLAIN, 30);
		rocket = new Rocketship(250, 700, 50, 50);
		o = new ObjectManager(rocket);
	}
	

	public void startGame() {
		t.start();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Test2");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Test3");
		if (e.getKeyCode() == KeyEvent.VK_ENTER && currentState == MENU_STATE) {
			currentState = GAME_STATE;
		} else if (e.getKeyCode() == KeyEvent.VK_ENTER && currentState == GAME_STATE) {
			currentState = END_STATE;
		} else if (e.getKeyCode() == KeyEvent.VK_ENTER && currentState == END_STATE) {
			currentState = MENU_STATE;
		}

	
if(e.getKeyCode()== KeyEvent.VK_DOWN) {
	moveDown =true;
}
if(e.getKeyCode()== KeyEvent.VK_UP) {
	moveUp =true;
}
if(e.getKeyCode()== KeyEvent.VK_LEFT) {
	moveLeft =true;
}
if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
	moveRight =true;
}
if(e.getKeyCode()== KeyEvent.VK_SPACE) {
	o.addProjectile(new Projectile (rocket.x+ 25,rocket.y+25,10,10));
}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Test4");
		if(e.getKeyCode()== KeyEvent.VK_DOWN) {
			moveDown =false;}
		if(e.getKeyCode()== KeyEvent.VK_UP) {
			moveUp =false;}
		if(e.getKeyCode()== KeyEvent.VK_LEFT) {
			moveLeft =false;}
		if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
			moveRight =false;}
	}

	public void updateMenuState() {

	}

	public void updateGameState() {
		o.update();
		o.manageEnemies();
	}

	public void updateEndState() {

	}

	public void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);

		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setFont(titleFont1);
		g.setColor(Color.WHITE);
		g.drawString("LEAGUE INVADERS!", 200, 200);
		g.setFont(titleFont2);
		g.setColor(Color.WHITE);
		g.drawString("Press 	ENTER to start", 200, 400);
		g.setFont(titleFont3);
		g.setColor(Color.WHITE);
		g.drawString("Press SPACE for instructions", 200, 600);
	}

	public void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);

		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		o.draw(g);
	}

	public void drawEndState(Graphics g) {
		g.setColor(Color.RED);

		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	}

}
