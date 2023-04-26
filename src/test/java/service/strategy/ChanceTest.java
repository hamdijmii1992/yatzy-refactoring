package service.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import domain.Roll;

public class ChanceTest {

    @Test
    public void testChance() {
	int expected = 15;
	int actual = new Chance().calculateScore(new Roll(2, 3, 4, 5, 1));
	assertEquals(expected, actual);
	assertEquals(16, new Chance().calculateScore(new Roll(3, 3, 4, 5, 1)));
    }
}
