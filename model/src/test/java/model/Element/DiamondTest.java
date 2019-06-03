package model.Element;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Map;
import model.Element.Player;;

public class DiamondTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWalkOver() throws SQLException {
		Map map = new Map();
		Player player = new Player();
		map.setOnTheMapXY(new Diamond(),1, 1);
		map.setOnTheMapXY(player, 2, 1);
		player.moveLeft(1, 1, map);
		if(map.getOnTheMapXY(1, 1).getSprite()=="PLAYER.jpg") 
		{
		map.setScore(map.getScore() + 1);
		assertEquals(1, map.getScore());
	}
	}

}
