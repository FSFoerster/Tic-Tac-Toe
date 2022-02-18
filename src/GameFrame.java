import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameFrame extends JFrame{
	GameFrame(){
		this.add(new GamePanel());
		this.setTitle("Tic Tac Toe");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		ImageIcon icon = new ImageIcon("TTT-Icon.png");
		this.setIconImage(icon.getImage());
	}
}
