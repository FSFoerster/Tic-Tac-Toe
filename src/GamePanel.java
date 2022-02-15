import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel extends JPanel{
	
	static final int SCREEN_SIZE = 384;
	static final int LABEL_SIZE = SCREEN_SIZE/3;
	
	GamePanel(){
		ImageIcon imageBG = new ImageIcon("TTT-Field.png");
		
		JLabel boxTL = new JLabel();
		JLabel boxTM = new JLabel();
		JLabel boxTR = new JLabel();
		JLabel boxML = new JLabel();
		JLabel boxMM = new JLabel();
		JLabel boxMR = new JLabel();
		JLabel boxBL = new JLabel();
		JLabel boxBM = new JLabel();
		JLabel boxBR = new JLabel();
		
		boxTL.setIcon(imageBG);
		boxTM.setIcon(imageBG);
		boxTR.setIcon(imageBG);
		boxML.setIcon(imageBG);
		boxMM.setIcon(imageBG);
		boxMR.setIcon(imageBG);
		boxBL.setIcon(imageBG);
		boxBM.setIcon(imageBG);
		boxBR.setIcon(imageBG);
		
		boxTL.setBounds(0, 0, LABEL_SIZE, LABEL_SIZE);
		boxTM.setBounds(128, 0, LABEL_SIZE, LABEL_SIZE);
		boxTR.setBounds(256, 0, LABEL_SIZE, LABEL_SIZE);
		boxML.setBounds(0, 128, LABEL_SIZE, LABEL_SIZE);
		boxMM.setBounds(128, 128, LABEL_SIZE, LABEL_SIZE);
		boxMR.setBounds(256, 128, LABEL_SIZE, LABEL_SIZE);
		boxBL.setBounds(0, 256, LABEL_SIZE, LABEL_SIZE);
		boxBM.setBounds(128, 256, LABEL_SIZE, LABEL_SIZE);
		boxBR.setBounds(256, 256, LABEL_SIZE, LABEL_SIZE);
		
		this.setPreferredSize(new Dimension(SCREEN_SIZE,SCREEN_SIZE));
		this.setBackground(new Color(0,255,0));
		this.setFocusable(true);
		this.setLayout(null);
		this.add(boxTL);
		this.add(boxTM);
		this.add(boxTR);
		this.add(boxML);
		this.add(boxMM);
		this.add(boxMR);
		this.add(boxBL);
		this.add(boxBM);
		this.add(boxBR);
		
		startGame();
	}
	public void startGame() {		
		
	}
}
