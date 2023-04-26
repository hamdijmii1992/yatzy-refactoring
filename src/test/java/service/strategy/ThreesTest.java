package service.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import domain.Roll;

public class ThreesTest {

    @Test
    public void testThrees() {
	int expected = 0;
	int actual = new Threes().calculateScore(new Roll(2, 1, 4, 5, 6));
	assertEquals(expected, actual);
	assertEquals(3, new Threes().calculateScore(new Roll(1, 2, 5, 2, 3)));
	assertEquals(6, new Threes().calculateScore(new Roll(1, 2, 3, 2, 3)));
	assertEquals(15, new Threes().calculateScore(new Roll(3, 3, 3, 3, 3)));
    }
}
