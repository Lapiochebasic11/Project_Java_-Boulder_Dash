package model.Element;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Map;

public class RockFallTest {

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
	public void testFreePlace() throws SQLException {
		Map map = new Map();
		RockFall rockFall = new RockFall();
		Empty empty = new Empty();
		map.setOnTheMapXY(rockFall,1, 1);
		map.setOnTheMapXY(empty, 1, 2);
		if (rockFall.freePlace(1,2,map)){
			rockFall.moveDown(1,1,map);
			}
		assertEquals(rockFall, map.getOnTheMapXY(1,2));
	}

	@Test
	public void testMoveDown() throws SQLException {
		Map map = new Map();
		RockFall rockFall = new RockFall();
		Empty empty = new Empty();
		map.setOnTheMapXY(rockFall,1, 1);
		map.setOnTheMapXY(empty, 1, 2);
		rockFall.moveDown(1,1,map);
		assertEquals(rockFall, map.getOnTheMapXY(1,2));
	}

	@Test
	public void testMoveLeft() throws SQLException {
		Map map = new Map();
		RockFall rockFall = new RockFall();
		Empty empty = new Empty();
		map.setOnTheMapXY(rockFall,2, 1);
		map.setOnTheMapXY(empty, 1, 1);
		rockFall.moveLeft(2,1,map);
		assertEquals(rockFall, map.getOnTheMapXY(1,1));
	}

	@Test
	public void testMoveRight() throws SQLException {
		Map map = new Map();
		RockFall rockFall = new RockFall();
		Empty empty = new Empty();
		map.setOnTheMapXY(rockFall,2, 1);
		map.setOnTheMapXY(empty, 3, 1);
		rockFall.moveRight(2,1,map);
		assertEquals(rockFall, map.getOnTheMapXY(3,1));
	}

}
