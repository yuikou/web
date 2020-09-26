import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BowlingGameTest {

	@Test
	void test() {
		Game g = new Game();
		for (int i = 0; i < 20; i++) {
			g.roll(0);
		}
		assertEquals(0, g.score());
	}

}
