import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel extends JPanel implements ActionListener{
	
	static final int SCREEN_SIZE = 384;
	static final int LABEL_SIZE = SCREEN_SIZE/3;
	JButton [] boxes = new JButton[9];
	boolean playerx_turn;
	
	ImageIcon imageBG = new ImageIcon("TTT-Field.png");
	ImageIcon imageX = new ImageIcon("TTT-X-Box.png");
	ImageIcon imageO = new ImageIcon("TTT-O-Box.png");
	ImageIcon imageXwins = new ImageIcon("TTT-X-wins.png");
	ImageIcon imageOwins = new ImageIcon("TTT-O-wins.png");
		
	GamePanel(){
				
		this.setPreferredSize(new Dimension(SCREEN_SIZE,SCREEN_SIZE));
		this.setBackground(new Color(0,255,0));
		this.setFocusable(true);
		this.setLayout(new GridLayout(3,3));
		
		for(int i=0;i<9;i++) {
			boxes[i] = new JButton();
			this.add(boxes[i]);
			boxes[i].setFocusable(false);
			boxes[i].addActionListener(this);
			boxes[i].setIcon(imageBG);
					
		}
		firstTurn();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			
		for(int i=0;i<9;i++) {
			if(e.getSource()==boxes[i]) {
				if(playerx_turn) {
					if(boxes[i].getIcon()==imageBG) {
						boxes[i].setIcon(imageX);
						playerx_turn=false;
						check();
					}
				}
				else {
					if(boxes[i].getIcon()==imageBG) {
						boxes[i].setIcon(imageO);
						playerx_turn=true;
						check();
					}
				}
			}
		}
	}
	public void firstTurn() {		
		playerx_turn=true;
	}
	public void check() {
	
		if( (boxes[0].getIcon()==imageX)&&
			(boxes[1].getIcon()==imageX)&&
			(boxes[2].getIcon()==imageX)) {
			xWins(0,1,2);
		}
		if( (boxes[3].getIcon()==imageX) &&
			(boxes[4].getIcon()==imageX) &&
			(boxes[5].getIcon()==imageX)) {
			xWins(3,4,5);
		}
		if(	(boxes[6].getIcon()==imageX) &&
			(boxes[7].getIcon()==imageX) &&
			(boxes[8].getIcon()==imageX)) {
			xWins(6,7,8);
		}
		if(	(boxes[0].getIcon()==imageX) &&
			(boxes[3].getIcon()==imageX) &&
			(boxes[6].getIcon()==imageX)) {
			xWins(0,3,6);
		}
		if(	(boxes[1].getIcon()==imageX) &&
			(boxes[4].getIcon()==imageX) &&
			(boxes[7].getIcon()==imageX)) {
			xWins(1,4,7);
		}
		if(	(boxes[2].getIcon()==imageX) &&
			(boxes[5].getIcon()==imageX) &&
			(boxes[8].getIcon()==imageX)) {
			xWins(2,5,8);
		}
		if(	(boxes[0].getIcon()==imageX) &&
			(boxes[4].getIcon()==imageX) &&
			(boxes[8].getIcon()==imageX)) {
			xWins(0,4,8);
		}
		if(	(boxes[2].getIcon()==imageX) &&
			(boxes[4].getIcon()==imageX) &&
			(boxes[6].getIcon()==imageX)) {
			xWins(2,4,6);
		}
		
		if(	(boxes[0].getIcon()==imageO) &&
			(boxes[1].getIcon()==imageO) &&
			(boxes[2].getIcon()==imageO)) {
			oWins(0,1,2);
		}
		if(	(boxes[3].getIcon()==imageO) &&
			(boxes[4].getIcon()==imageO) &&
			(boxes[5].getIcon()==imageO)) {
			oWins(3,4,5);
		}
		if(	(boxes[6].getIcon()==imageO) &&
			(boxes[7].getIcon()==imageO) &&
			(boxes[8].getIcon()==imageO)) {
			oWins(6,7,8);
		}
		if(	(boxes[0].getIcon()==imageO) &&
			(boxes[3].getIcon()==imageO) &&
			(boxes[6].getIcon()==imageO)) {
			oWins(0,3,6);
		}
		if(	(boxes[1].getIcon()==imageO) &&
			(boxes[4].getIcon()==imageO) &&
			(boxes[7].getIcon()==imageO)) {
			oWins(1,4,7);
		}
		if(	(boxes[2].getIcon()==imageO) &&
			(boxes[5].getIcon()==imageO) &&
			(boxes[8].getIcon()==imageO)) {
			oWins(2,5,8);
		}
		if(	(boxes[0].getIcon()==imageO) &&
			(boxes[4].getIcon()==imageO) &&
			(boxes[8].getIcon()==imageO)) {
			oWins(0,4,8);
		}
		if(	(boxes[2].getIcon()==imageO) &&
			(boxes[4].getIcon()==imageO) &&
			(boxes[6].getIcon()==imageO)) {
			oWins(2,4,6);
		}
		
	}
	public void xWins(int a,int b,int c) {
		
		for(int i=0;i<3;i++) {
			boxes[a].setIcon(imageXwins);
			boxes[b].setIcon(imageXwins);
			boxes[c].setIcon(imageXwins);
			 
		}
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			/* 
			boxes[a].setIcon(imageX);
			boxes[b].setIcon(imageX);
			boxes[c].setIcon(imageX);
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		
		clear();
	}
	public void oWins(int a,int b,int c) {
		
		for(int i=0;i<3;i++) {
			boxes[a].setIcon(imageOwins);
			boxes[b].setIcon(imageOwins);
			boxes[c].setIcon(imageOwins);
		} 
		/*	
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			/* 
			boxes[a].setIcon(imageO);
			boxes[b].setIcon(imageO);
			boxes[c].setIcon(imageO);
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		
		//clear();
	}
	public void clear() {
		for(int i=0;i<9;i++) {
			boxes[i].setIcon(imageBG);
		}
		firstTurn();
	}
}

