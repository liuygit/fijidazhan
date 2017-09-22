package feijidazhan;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class plane {
	JLabel label;
	ImageIcon pic;
	private int mp;
	private int positionX;
	private int positionY;
	private int xSize;
	private int ySize;
	
	plane(){
		mp=100;
		label=new JLabel(pic);
	}
	
	abstract void move();
	abstract void fire();
	abstract void onFired();
	abstract void isDead();

	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getPositionX() {
		return positionX;
	}
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	public int getPositionY() {
		return positionY;
	}
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	public int getxSize() {
		return xSize;
	}
	public void setxSize(int xSize){
		this.xSize=xSize;
	}
	public void setySize(int ySize){

		this.ySize=ySize;
	}
	public int getySize() {
		return ySize;
	}
	
}
