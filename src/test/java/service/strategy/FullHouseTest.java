package service.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import domain.Roll;

public class FullHouseTest {

    @Test
    public void fullHouseTest() {
	int expected = 0;
	int actual = new FullHouse().calculateScore(new Roll(2, 3, 4, 5, 6));
	assertEquals(expected, actual);
	assertEquals(0, new FullHouse().calculateScore(new Roll(1, 2, 2, 2, 6)));
	assertEquals(0, new FullHouse().calculateScore(new Roll(4, 4, 4, 4, 4)));
	assertEquals(0, new FullHouse().calculateScore(new Roll(2, 2, 3, 3, 4)));
	assertEquals(18, new FullHouse().calculateScore(new Roll(6, 2, 2, 2, 6)));
	assertEquals(17, new FullHouse().calculateScore(new Roll(3, 3, 3, 4, 4)));
	assertEquals(7, new FullHouse().calculateScore(new Roll(1, 2, 1, 2, 1)));
    }
}
