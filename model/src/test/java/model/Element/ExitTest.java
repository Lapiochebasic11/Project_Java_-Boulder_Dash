package model.Element;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Map;

public class ExitTest {

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
		Player player= new Player();
		Exit exit = new Exit();
		map.setOnTheMapXY(player,2, 1);
		map.setOnTheMapXY(exit, 1, 1);
		player.moveLeft(2,1,map);
		assertEquals(true, map.getWin());
	}

}
