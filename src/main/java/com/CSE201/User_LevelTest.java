import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class User_LevelTest {
	
	@Test
	void testUser_Level() {
		User_Level level = new User_Level();
		assertEquals(0, level.getLevel());
		
	}

	@Test
	void testUser_LevelInt() {
		User_Level level = new User_Level(0);
		assertEquals(0, level.getLevel());
		User_Level level1 = new User_Level(1);
		assertEquals(1, level1.getLevel());
		User_Level level2 = new User_Level(2);
		assertEquals(2, level2.getLevel());
		User_Level level3 = new User_Level(3);
		assertEquals(3, level3.getLevel());
		
		User_Level level4 = new User_Level(4);
		assertEquals(-1, level4.getLevel());
	}

	@Test
	void testEqualsObject() {
		User_Level level = new User_Level(3);
		User_Level level1 = new User_Level(3);
		User_Level level2 = new User_Level(0);
		assertTrue(level.equals(level1));
		assertFalse(level.equals(level2));
	}

	@Test
	void testToString() {
		User_Level level = new User_Level(3);
		assertEquals("This user's level is : 3", level.toString());
		User_Level level1 = new User_Level(4);
		assertEquals("error!!", level1.toString());
	}

	@Test
	void testGetLevel() {
		User_Level level = new User_Level(2);
		assertEquals(2, level.getLevel());
	}

	@Test
	void testSetLevel() {
		User_Level level = new User_Level(2);
		assertEquals(2, level.getLevel());
		level.setLevel(0);
		assertEquals(0, level.getLevel());
	}

	@Test
	void testLevelpermission() {
		User_Level level = new User_Level(2);
		assertEquals("developer", level.levelpermission(level.getLevel()));
		User_Level level2 = new User_Level(0);
		assertEquals("guest", level2.levelpermission(level2.getLevel()));
		User_Level level3 = new User_Level(1);
		assertEquals("base user", level3.levelpermission(level3.getLevel()));
		User_Level level4 = new User_Level(3);
		assertEquals("administrator", level4.levelpermission(level4.getLevel()));
		User_Level level5 = new User_Level(5);
		assertEquals("error", level5.levelpermission(level5.getLevel()));
		
		
	}

}
