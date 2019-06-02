package model.Element;

import java.io.*;
import sun.audio.*;

public class SoundBox 
{
	public static void diamondget()
	{
		InputStream music;
		try 
		{
			music = new FileInputStream(new File("../ressources/diamondget.wav"));
			AudioStream audio = new AudioStream(music);
			AudioPlayer.player.start(audio);
		}
		
		catch (Exception e)
		{
			//System.out.print("diamond sound file unreadable");
		}
	}
	
	public static void playerdie()
	{
		InputStream music;
		try 
		{
			music = new FileInputStream(new File("../ressources/lose.wav"));
			AudioStream audio = new AudioStream(music);
			AudioPlayer.player.start(audio);
		}
		
		catch (Exception e)
		{
			//System.out.print("lose sound file unreadable");
		}
	}
	
	public static void playerwin()
	{
		InputStream music;
		try 
		{
			music = new FileInputStream(new File("../ressources/win.wav"));
			AudioStream audio = new AudioStream(music);
			AudioPlayer.player.start(audio);
		}
		
		catch (Exception e)
		{
			//System.out.print("win sound file unreadable");
		}
	}
	
	public static void theme()
	{
		InputStream music;
		try 
		{
			music = new FileInputStream(new File("../ressources/theme.wav"));
			AudioStream audio = new AudioStream(music);
			AudioPlayer.player.start(audio);
		}
		
		catch (Exception e)
		{
			//System.out.print("theme sound file unreadable");
		}
	}
}
