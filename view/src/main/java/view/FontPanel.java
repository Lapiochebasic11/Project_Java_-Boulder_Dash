package view;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import model.Model;

/**
 * @author Emanuel Caracciolo
 * @version 1.0
 */

public class FontPanel extends Container 
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	private Model model;

/**
 * Load the map with the element on the screen
 * 
 * @param model call the model
 * @param x implement X axis
 * @param y implement Y axis
 * @throws IOException Signals that an I/O exception of some sort has occurred
 */
	
	FontPanel (Model model, int x , int y ) throws IOException
	{
		this.model= model;
		setLayout(new GridLayout(x,y));
		for (int i = 0; i<x ; i++)
		{
			for (int j = 0; j<y ; j++)
			{
				String adress = "..\\ressources\\";
				String spriteName =  model.getMap().getOnTheMapXY(j,i).getSprite();
				String adressSprite = adress + spriteName;
				File OpenSprite = new File(adressSprite);
				Image image = ImageIO.read(OpenSprite);
				JPanel displayPanel = new GamePanel<Object>(image); 
				add (displayPanel);
			}
		}
	}

}