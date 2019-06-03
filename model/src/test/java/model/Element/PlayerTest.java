package model.Element;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Map;

public class PlayerTest {

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
		Enemy enemy = new Enemy();
		map.setOnTheMapXY(player,1, 2);
		map.setOnTheMapXY(enemy, 2, 2);
		enemy.moveLeft(2, 2, map);
		assertEquals(true , map.getLose());
	}

	@Test
	public void testDeathIntIntMap() throws SQLException {
		Map map = new Map();
		Player player = new Player();
		Enemy enemy = new Enemy();
		map.setOnTheMapXY(player,1, 2);
		map.setOnTheMapXY(enemy, 2, 2);
		enemy.moveLeft(2, 2, map);
		assertEquals(true , map.getLose());
	}

	@Test
	public void testMoveUp() throws SQLException {
		Map map = new Map();
		Player player = new Player();
		Empty empty = new Empty();
		map.setOnTheMapXY(player,1, 2);
		map.setOnTheMapXY(empty, 1, 1);
		player.moveUp(1,2,map);
		assertEquals(player, map.getOnTheMapXY(1,1));
	}

	@Test
	public void testMoveDown() throws SQLException {
		Map map = new Map();
		Player player = new Player();
		Empty empty = new Empty();
		map.setOnTheMapXY(player,1, 2);
		map.setOnTheMapXY(empty, 1, 3);
		player.moveDown(1,2,map);
		assertEquals(player, map.getOnTheMapXY(1,3));
	}

	@Test
	public void testMoveLeft() throws SQLException {
		Map map = new Map();
		Player player = new Player();
		Empty empty = new Empty();
		map.setOnTheMapXY(player,2, 1);
		map.setOnTheMapXY(empty, 1, 1);
		player.moveLeft(2,1,map);
		assertEquals(player, map.getOnTheMapXY(1,1));
	}

	@Test
	public void testMoveRight() throws SQLException {
		Map map = new Map();
		Player player = new Player();
		Empty empty = new Empty();
		map.setOnTheMapXY(player,2, 1);
		map.setOnTheMapXY(empty, 3, 1);
		player.moveRight(2,1,map);
		assertEquals(player, map.getOnTheMapXY(3,1));
	}

}
