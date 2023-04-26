package service.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import domain.Roll;

public class TwosTest {

    @Test
    public void testTwos() {
	int expected = 0;
	int actual = new Twos().calculateScore(new Roll(1, 3, 4, 5, 6));
	assertEquals(expected, actual);
	assertEquals(4, new Twos().calculateScore(new Roll(1, 2, 3, 2, 6)));
	assertEquals(10, new Twos().calculateScore(new Roll(2, 2, 2, 2, 2)));
	assertEquals(2, new Twos().calculateScore(new Roll(6, 2, 4, 1, 6)));
    }
}
