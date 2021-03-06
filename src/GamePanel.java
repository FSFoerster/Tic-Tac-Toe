import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.*;
import java.io.*;

public class GamePanel extends JPanel implements ActionListener{
	
	static final int SCREEN_LENGTH = 384;
	static final int SCREEN_HEIGHT = 512;
	static final int LABEL_SIZE = SCREEN_LENGTH/3;
	Desktop desktop = java.awt.Desktop.getDesktop();
	JButton [] boxes = new JButton[9];
	JButton nextGame = new JButton();
	JButton useless = new JButton();
	JButton github = new JButton();
	int player_turn = 0;
	boolean full;
	
	ImageIcon imageBG = new ImageIcon("TTT-Field.png");
	ImageIcon imageX = new ImageIcon("TTT-X-Box.png");
	ImageIcon imageO = new ImageIcon("TTT-O-Box.png");
	ImageIcon imageXwins = new ImageIcon("TTT-X-wins.png");
	ImageIcon imageOwins = new ImageIcon("TTT-O-wins.png");
	ImageIcon imagenouse = new ImageIcon("TTT-useless.png");
	ImageIcon imagenext = new ImageIcon("TTT-Next.png");
	ImageIcon imageGithub = new ImageIcon("TTT-Github.png");
		
	GamePanel(){
				
		this.setPreferredSize(new Dimension(SCREEN_LENGTH,SCREEN_HEIGHT));
		this.setBackground(new Color(0,255,0));
		this.setFocusable(true);
		this.setLayout(new GridLayout(4,3));
				
		useless.setIcon(imagenouse);
		useless.addActionListener(this);
		nextGame.setIcon(imagenext);
		nextGame.addActionListener(this);
		github.setIcon(imageGithub);
		github.addActionListener(this);
		
		for(int i=0;i<9;i++) {
			boxes[i] = new JButton();
			this.add(boxes[i]);
			boxes[i].setFocusable(false);
			boxes[i].addActionListener(this);
			boxes[i].setIcon(imageBG);
		}
		this.add(useless);
		this.add(nextGame);
		this.add(github);
	
		firstTurn();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			
		for(int i=0;i<9;i++) {
			if(e.getSource()==boxes[i]) {
				if(player_turn == 0) {
					if(boxes[i].getIcon()==imageBG) {
						boxes[i].setIcon(imageX);
						player_turn=1;
						check();
					}
				}
				else if(player_turn == 1){
					if(boxes[i].getIcon()==imageBG) {
						boxes[i].setIcon(imageO);
						player_turn=0;
						check();
					}
				}
				else {
					System.out.println("Ich mag Kuchen");
				}
			}
		}
		if(e.getSource()==nextGame) {
			clear();
		}
		if(e.getSource()==useless) {
			
			Desktop use = Desktop.getDesktop();
			try {
				use.browse(new URI("https://theuselessweb.com/"));
			} catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				System.out.println("There was an error lol.");
				e1.printStackTrace();
			}
			
			System.exit(0);
		}
		if(e.getSource()==github) {
			
			Desktop gitURL = Desktop.getDesktop();
			try {
				gitURL.browse(new URI("https://github.com/FSFoerster"));
			} catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}
	public void firstTurn() {		
		player_turn=0;
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
		if((boxes[0].getIcon().equals(imageX) || boxes[0].getIcon().equals(imageO)) &&
		   (boxes[1].getIcon().equals(imageX) || boxes[1].getIcon().equals(imageO)) && 
		   (boxes[2].getIcon().equals(imageX) || boxes[2].getIcon().equals(imageO)) && 
		   (boxes[3].getIcon().equals(imageX) || boxes[3].getIcon().equals(imageO)) && 
		   (boxes[4].getIcon().equals(imageX) || boxes[4].getIcon().equals(imageO)) && 
		   (boxes[5].getIcon().equals(imageX) || boxes[5].getIcon().equals(imageO)) && 
		   (boxes[6].getIcon().equals(imageX) || boxes[6].getIcon().equals(imageO)) && 
		   (boxes[7].getIcon().equals(imageX) || boxes[7].getIcon().equals(imageO)) && 
		   (boxes[8].getIcon().equals(imageX) || boxes[8].getIcon().equals(imageO))) {
			
			clear();
		}
	
	}
	public void xWins(int a,int b,int c) {
		
	
		for(int i=0;i<3;i++) {
			boxes[a].setIcon(imageXwins);
			boxes[b].setIcon(imageXwins);
			boxes[c].setIcon(imageXwins);
		}
		player_turn=2;
		
	}	
	public void oWins(int a,int b,int c) {
		
		for(int i=0;i<3;i++) {
			boxes[a].setIcon(imageOwins);
			boxes[b].setIcon(imageOwins);
			boxes[c].setIcon(imageOwins);
		}
		player_turn=2;
		
	}
	public void clear() {
		
		for(int i=0;i<9;i++) {
			boxes[i].setIcon(imageBG);
		}
		firstTurn();
		
	}
	
}

