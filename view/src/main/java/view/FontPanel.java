package view;

import java.awt.Container;
//import model.*;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

//import com.mysql.cj.api.xdevapi.Table;

import model.Model;
import model.Element.Element;;




public class FontPanel extends Container {
	

	
	/*public FontPanel(BoulderDashModel model) {
		super();
		this.model = model;
	}*/

	private static final long serialVersionUID = 1L;
	private Model model;

	
	
	//public void BoulderDashView(BoulderDashModel model) {
	//	this.model = model;
	//}
	
	
	/*FontPanel (Model model, int x, int y) {
		System.out.println("construteur FontPanel");
		this.model= model;
		//System.out.println(model);
		System.out.println(x);
		System.out.println(y);
	}
	*/

	FontPanel (Model model, int x , int y ) throws IOException 
	{
		this.model= model;
		System.out.println("FontPanel ");
		setLayout(new GridLayout(x,y));
		for (int i = 0; i<x ; i++)
		{
			for (int j = 0; j<y ; j++)
			{
				
				String adress = "..\\ressources\\";
				String spriteName =  model.getMap().getOnTheMapXY(i,j).getSprite();
				String jpg = "";
				String adressSprite = adress + spriteName + jpg; 
				System.out.println(adressSprite);
				File OpenSprite = new File(adressSprite);
				Image image = ImageIO.read(OpenSprite);
				JPanel displayPanel = new GamePanel(image); 
				//displayPanel.drawImage(image, 0,0,this);
				add (displayPanel);
				repaint();
			}
			repaint();
		}
		repaint();
	}
	
}