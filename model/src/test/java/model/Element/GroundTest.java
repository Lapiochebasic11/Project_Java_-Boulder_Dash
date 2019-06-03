package model.Element;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Map;

public class GroundTest {

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
		Ground ground = new Ground();
		map.setOnTheMapXY(player,2, 2);
		map.setOnTheMapXY(ground, 1, 2);
		player.moveLeft(2, 2, map);
		assertEquals(player , map.getOnTheMapXY(1, 2));
	}

}
