package view;

import javax.swing.ImageIcon;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import view.View;

public class ViewTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        
    }

    @Before
    public void setUp() throws Exception {
        @SuppressWarnings("unused")
		View test = new View(null);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testView() {
        @SuppressWarnings("unused")
		ImageIcon img = new ImageIcon("../ressources/icon.png");
    }

    @Test
    public void TestGameOvers() {
        GameOver.GameOvers();
    }

    @Test
    public void TestGameWin() {
        GameWin.GameWins();
    }
}