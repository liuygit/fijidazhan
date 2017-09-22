package feijidazhan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class hero extends plane implements KeyListener{
	
	
	
	
	 hero(int a){
		setMp(100);
		setPositionX(200);
		setPositionY(600);
		super.setxSize(72);
		super.setySize(72);
		
		
		pic=new ImageIcon("src\\img\\hero.png");
		label=new JLabel(pic);
		label.setBounds(getPositionX(), getPositionY(), getxSize(), getySize());
		
		
	}


	void move() {
		// TODO Auto-generated method stub

	}

	@Override
	void fire() {
		// TODO Auto-generated method stub

	}

	@Override
	void onFired() {
		// TODO Auto-generated method stub

	}

	@Override
	void isDead() {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
