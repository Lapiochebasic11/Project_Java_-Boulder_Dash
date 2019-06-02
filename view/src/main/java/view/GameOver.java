package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author vilas
 * @version 1.0
 */

public class GameOver extends JPanel
{
	private static final long serialVersionUID = 1L;

/**
 * Create a new window painted in red with "you lose" written
 * 
 */
	
	public static void GameOvers()
	{		
		JLabel label= new JLabel("You lose !");	
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		
		JFrame frame= new JFrame("Game Over");
		frame.setSize(250, 250);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.red);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);	
		frame.add(label);
	}
}
