package view;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import view.ViewPanel;

public class ViewFrame extends JFrame implements KeyListener
{
	private static final long serialVersionUID = 1L;
	public ViewPanel draw;
	public ViewFrame() 
	{
		JFrame jframe = new JFrame();
		ViewPanel viewpanel = new ViewPanel();

		this.draw = new ViewPanel();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
	}

	public void Windows()
	{
		ViewFrame frame = new ViewFrame();
		
		frame.setTitle("Boulder Dash");
        frame.setResizable(true);
        frame.setSize(1920, 1080);
        frame.setMinimumSize(new Dimension(1920, 1080));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(frame.draw);
        frame.pack();
        frame.setVisible(true);
        
        ImageIcon img = new ImageIcon("../ressources/icon.png");
		frame.setIconImage(img.getImage());
	}

	 	public void keyPressed(KeyEvent e) 
	 	{
	 		 if(e.getKeyCode()== KeyEvent.VK_RIGHT)
		            draw.moveRight();
		        else if(e.getKeyCode()== KeyEvent.VK_LEFT)
		            draw.moveLeft();
		        else if(e.getKeyCode()== KeyEvent.VK_DOWN)
		            draw.moveDown();
		        else if(e.getKeyCode()== KeyEvent.VK_UP)
		            draw.moveUp();
		        repaint();
	    }

	    public void keyReleased(KeyEvent e) 
	    {

	    }
	    
	    public void keyTyped(KeyEvent e) 
	    {

	    }
}
