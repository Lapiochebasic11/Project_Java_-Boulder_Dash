package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameWin extends JPanel
{
	private static final long serialVersionUID = 1L;

	public static void GameWins()
	{		
		JLabel label= new JLabel("You Win !");	
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		
	    //JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame= new JFrame("Game Over");
		frame.setSize(250, 250);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.green);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);	
		frame.add(label);
	}
}