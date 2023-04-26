package service.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import domain.Roll;

public class LargeStraightTest {

    @Test
    public void testLargeStraight() {
	int expected = 0;
	int actual = new LargeStraight().calculateScore(new Roll(1, 2, 2, 4, 5));
	assertEquals(expected, actual);
	assertEquals(20, new LargeStraight().calculateScore(new Roll(6, 2, 3, 4, 5)));
	assertEquals(20, new LargeStraight().calculateScore(new Roll(2, 3, 4, 5, 6)));
    }
}
