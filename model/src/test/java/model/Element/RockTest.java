package model.Element;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Map;

public class RockTest {

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
		Rock rock = new Rock();
		map.setOnTheMapXY(rock,2, 1);
		map.setOnTheMapXY(player, 1, 1);
		map.setOnTheMapXY(new Empty(), 3, 1);
		player.moveRight(1, 1, map);
		assertEquals(rock , map.getOnTheMapXY(3,1));
	}
	}

