package service.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import domain.Roll;

public class PairTest {

    @Test
    public void testPair() {
	int expected = 0;
	int actual = new Pair().calculateScore(new Roll(2, 4, 3, 5, 6));
	assertEquals(expected, actual);
	assertEquals(6, new Pair().calculateScore(new Roll(3, 4, 3, 5, 6)));
	assertEquals(10, new Pair().calculateScore(new Roll(5, 3, 3, 3, 5)));
	assertEquals(12, new Pair().calculateScore(new Roll(5, 3, 6, 6, 5)));
    }
}
