package service.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import domain.Roll;

public class TwoPairTest {

    @Test
    public void testTwoPair() {
	int expected = 0;
	int actual = new TwoPair().calculateScore(new Roll(3, 3, 4, 3, 5));
	assertEquals(expected, actual);
	assertEquals(16, new TwoPair().calculateScore(new Roll(3, 3, 5, 4, 5)));
	assertEquals(16, new TwoPair().calculateScore(new Roll(3, 3, 5, 5, 5)));
	assertEquals(12, new TwoPair().calculateScore(new Roll(2, 2, 4, 1, 4)));
    }
}
