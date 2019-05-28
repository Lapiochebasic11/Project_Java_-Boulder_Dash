package view;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import view.ViewPanel;
import view.View;

public class ViewFrame extends JFrame
{
	private static final long serialVersionUID = 1L;

	public ViewFrame() 
	{
		JFrame jframe = new JFrame();
		ViewPanel viewpanel = new ViewPanel();
		
		int width = 1920;
		int height = 1080;
		jframe.setSize(width, height);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setTitle("Boulder Dash");
		jframe.setContentPane(viewpanel);
		
		
		ImageIcon img = new ImageIcon("../ressources/icon.png");
		jframe.setIconImage(img.getImage());
	}
	
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
	    switch( keyCode ) { 
	        case KeyEvent.VK_UP:
	        	System.out.print("haut ! fdp ca marche !");
	            break;
	        case KeyEvent.VK_DOWN:
	            // handle down 
	            break;
	        case KeyEvent.VK_LEFT:
	            // handle left
	            break;
	        case KeyEvent.VK_RIGHT :
	            // handle right
	            break;
	     }
	}
}