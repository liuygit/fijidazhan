package feijidazhan;

import java.awt.*;

import javax.swing.*;

public class myFrame extends JFrame {
	myFrame(){
	setSize(480,800);
	setVisible(true);
	setLocation(300, 300);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	ImageIcon startPage=new ImageIcon("src\\img\\startPage.png");
	JLabel jlb=new JLabel(startPage);
	add(jlb);
	
	//
	JButton jbt=new JButton("2222222");
	jbt.setBounds(10, 10, 20, 20);
	jlb.add(jbt);

	}
	
	

}
