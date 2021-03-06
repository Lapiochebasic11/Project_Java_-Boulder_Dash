package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Emanuel Caracciolo
 * @version 1.0
 */
public class keyControler implements KeyListener 
{	
	private static int keyUser = 0;

/**
 * Invoked when a key has been pressed
 * 
 * @param e calls when a key is pressed
 */

    public void keyPressed(KeyEvent e) 
    { 
       keyUser = e.getKeyCode();
    }   
 
/**
 * Invoked when a key has been released
 * 
 * @param e calls when a key is pressed
 */
    public void keyReleased(KeyEvent e) 
    {
    	keyUser = 0;
    }   
 
/**
 * Invoked when a key has been typed
 * 
 * @param e calls when a key is pressed
 */
    public void keyTyped(KeyEvent e) 
    {
    	
    }
   
/**
 *
 * @return wether or not if a key is pressed
 */
	public static int getKeyUser() 
	{  
		return keyUser;
	}

}