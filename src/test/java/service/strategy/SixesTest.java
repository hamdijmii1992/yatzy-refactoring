package service.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import domain.Roll;

public class SixesTest {

    @Test
    public void testSixes() {
	int expected = 0;
	int actual = new Sixes().calculateScore(new Roll(4, 4, 4, 5, 5));
	assertEquals(expected, actual);
	assertEquals(6, new Sixes().calculateScore(new Roll(4, 4, 6, 5, 5)));
	assertEquals(12, new Sixes().calculateScore(new Roll(1, 5, 6, 6, 5)));
	assertEquals(30, new Sixes().calculateScore(new Roll(6, 6, 6, 6, 6)));
    }
}
