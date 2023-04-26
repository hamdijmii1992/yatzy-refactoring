package service.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import domain.Roll;

public class SmallStraightTest {

    @Test
    public void testSmallStraight() {
	int expected = 0;
	int actual = new SmallStraight().calculateScore(new Roll(1, 2, 2, 4, 5));
	assertEquals(expected, actual);
	assertEquals(15, new SmallStraight().calculateScore(new Roll(1, 2, 3, 4, 5)));
	assertEquals(15, new SmallStraight().calculateScore(new Roll(2, 3, 4, 5, 1)));
    }
}
