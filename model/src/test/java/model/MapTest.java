package model;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import model.Element.Player;

public class MapTest {

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
	public void testFillOnTheMap() throws SQLException {
		Map map = new Map();
		Player player = new Player();
		map.setOnTheMapXY(player, 4, 5);
		assertEquals(player, map.getOnTheMapXY(4,5));
	}
	
}

	
