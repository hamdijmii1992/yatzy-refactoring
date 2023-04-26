package service.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import domain.Roll;

public class OnesTest {
    @Test
    public void testOnes() {
	int expected = 0;
	int actual = new Ones().calculateScore(new Roll(6, 2, 2, 4, 5));
	assertEquals(expected, actual);
	assertEquals(1, new Ones().calculateScore(new Roll(1, 2, 3, 4, 5)));
	assertEquals(2, new Ones().calculateScore(new Roll(1, 2, 1, 4, 5)));
	assertEquals(5, new Ones().calculateScore(new Roll(1, 1, 1, 1, 1)));
    }
}
