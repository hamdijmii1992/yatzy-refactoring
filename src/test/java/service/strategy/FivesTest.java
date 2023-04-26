package service.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import domain.Roll;

public class FivesTest {

    @Test
    public void testFives() {
	int expected = 0;
	int actual = new Fives().calculateScore(new Roll(4, 3, 2, 1, 6));
	assertEquals(expected, actual);
	assertEquals(5, new Fives().calculateScore(new Roll(4, 4, 4, 3, 5)));
	assertEquals(10, new Fives().calculateScore(new Roll(4, 4, 4, 5, 5)));
	assertEquals(25, new Fives().calculateScore(new Roll(5, 5, 5, 5, 5)));
    }

}
