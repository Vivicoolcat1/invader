package invader;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel  implements ActionListener, KeyListener{  
		Timer t ;
		final int MENU_STATE = 0;

		final int GAME_STATE = 1;

		final int END_STATE = 2;
		
		int currentState = MENU_STATE;
		@Override

		public void paintComponent(Graphics g){

			if(currentState == MENU_STATE){

                drawMenuState(g);

        }else if(currentState == GAME_STATE){

                drawGameState(g);

        }else if(currentState == END_STATE){

                drawEndState(g);

        }
 

		        }
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Test1");
			repaint();
			  if(currentState == MENU_STATE){

	                updateMenuState();

	        }else if(currentState == GAME_STATE){

	                updateGameState();

	        }else if(currentState == END_STATE){

	                updateEndState();

	        }

			  

		
		}
	
	
	

	public GamePanel() {
		t = new Timer(1000/60, this);
	
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
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Test4");
}
	
public void updateMenuState() {
	
}

public void updateGameState () {
	
}

public void updateEndState () {
	
}
public void drawMenuState(Graphics g) {
	g.setColor(Color.BLUE);

	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);  
}

public void drawGameState (Graphics g) {
	
}

public void drawEndState (Graphics g) {
	
}

}

