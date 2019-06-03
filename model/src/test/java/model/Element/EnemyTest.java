package model.Element;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Map;

public class EnemyTest {

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
		RockFall rockFall = new RockFall();
		Enemy enemy = new Enemy();
		map.setOnTheMapXY(rockFall,2, 1);
		map.setOnTheMapXY(enemy, 2, 2);
		rockFall.moveDown(2, 1, map);
		assertNotSame(enemy, map.getOnTheMapXY(2, 2));
	}

	@Test
	public void testDeathIntIntMap() throws SQLException {
		Map map = new Map();
		RockFall rockFall = new RockFall();
		Enemy enemy = new Enemy();
		map.setOnTheMapXY(rockFall,2, 1);
		map.setOnTheMapXY(enemy, 2, 2);
		rockFall.moveDown(2, 1, map);
		assertNotSame(enemy, map.getOnTheMapXY(2, 2));
	}


	@Test
	public void testMoveUp() throws SQLException {
		Map map = new Map();
		Enemy enemy = new Enemy();
		Empty empty = new Empty();
		map.setOnTheMapXY(enemy,1, 2);
		map.setOnTheMapXY(empty, 1, 1);
		enemy.moveUp(1,2,map);
		assertEquals(enemy, map.getOnTheMapXY(1,1));
	}

	@Test
	public void testMoveDown() throws SQLException {
		Map map = new Map();
		Enemy enemy = new Enemy();
		Empty empty = new Empty();
		map.setOnTheMapXY(enemy,1, 2);
		map.setOnTheMapXY(empty, 1, 3);
		enemy.moveDown(1,2,map);
		assertEquals(enemy, map.getOnTheMapXY(1,3));
	}

	@Test
	public void testMoveLeft() throws SQLException {
		Map map = new Map();
		Enemy enemy = new Enemy();
		Empty empty = new Empty();
		map.setOnTheMapXY(enemy,2, 1);
		map.setOnTheMapXY(empty, 1, 1);
		enemy.moveUp(2,1,map);
		assertEquals(enemy, map.getOnTheMapXY(1,1));
	}

	@Test
	public void testMoveRight() throws SQLException {
		Map map = new Map();
		Enemy enemy = new Enemy();
		Empty empty = new Empty();
		map.setOnTheMapXY(enemy,2, 1);
		map.setOnTheMapXY(empty, 3, 1);
		enemy.moveUp(2,1,map);
		assertEquals(enemy, map.getOnTheMapXY(3,1));
	}

}
