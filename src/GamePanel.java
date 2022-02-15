import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel extends JPanel implements ActionListener{
	
	static final int SCREEN_SIZE = 384;
	static final int LABEL_SIZE = SCREEN_SIZE/3;
	JButton boxTL,boxTM,boxTR,boxML,boxMM,boxMR,boxBL,boxBM,boxBR;
	boolean boxTL_p,boxTM_p,boxTR_p,boxML_p,boxMM_p,boxMR_p,boxBL_p,boxBM_p,boxBR_p = false;
	
	GamePanel(){
		ImageIcon imageBG = new ImageIcon("TTT-Field.png");
				
		boxTL = new JButton();
		boxTM = new JButton();
		boxTR = new JButton();
		boxML = new JButton();
		boxMM = new JButton();
		boxMR = new JButton();
		boxBL = new JButton();
		boxBM = new JButton();
		boxBR = new JButton();
		
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
		
		boxTL.addActionListener(this);
		boxTM.addActionListener(this);
		boxTR.addActionListener(this);
		boxML.addActionListener(this);
		boxMM.addActionListener(this);
		boxMR.addActionListener(this);
		boxBL.addActionListener(this);
		boxBM.addActionListener(this);
		boxBR.addActionListener(this);
		
		startGame();
	}
	public void startGame() {		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if((e.getSource() == boxTL)&&(boxTL_p == false)) {
			//boxTL.setIcon("X-Box");
			boxTL_p = true;
			
		}
		if((e.getSource() == boxTM)&&(boxTM_p == false)) {
			//boxTM.setIcon("X-Box");
			boxTM_p = true;
			
		}
		if((e.getSource() == boxTR)&&(boxTR_p == false)) {
			//boxTR.setIcon("X-Box");
			boxTR_p = true;
			
		}
		if((e.getSource() == boxML)&&(boxML_p == false)) {
			//boxML.setIcon("X-Box");
			boxML_p = true;
			
		}
		if((e.getSource() == boxMM)&&(boxMM_p == false)) {
			//boxMM.setIcon("X-Box");
			boxMM_p = true;
			
		}
		if((e.getSource() == boxMR)&&(boxMR_p == false)) {
			//boxMR.setIcon("X-Box");
			boxMR_p = true;
			
		}
		if((e.getSource() == boxBL)&&(boxBL_p == false)) {
			//boxBL.setIcon("X-Box");
			boxBL_p = true;
			
		}
		if((e.getSource() == boxBM)&&(boxBM_p == false)) {
			//boxBM.setIcon("X-Box");
			boxBM_p = true;
			
		}
		if((e.getSource() == boxBR)&&(boxBR_p == false)) {
			//boxBR.setIcon("X-Box");
			boxBR_p = true;
			
		}
		
		
	}
}
