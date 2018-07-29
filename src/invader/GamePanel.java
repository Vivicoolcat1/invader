package invader;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel  implements ActionListener, KeyListener{  
		Timer t ;
		GameObject c;
		@Override

		public void paintComponent(Graphics g){

		            c.draw(g);

		        }
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Test1");
			repaint();
			c.update();
		}
	
	
	

	public GamePanel() {
		t = new Timer(1000/60, this);
		c = new GameObject();
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
	}

