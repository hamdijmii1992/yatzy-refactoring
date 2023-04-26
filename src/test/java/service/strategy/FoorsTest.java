package service.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import domain.Roll;

public class FoorsTest {

    @Test
    public void testFours() {
	int expected = 0;
	int actual = new Foors().calculateScore(new Roll(3, 5, 5, 5, 5));
	assertEquals(expected, actual);
	assertEquals(4, new Foors().calculateScore(new Roll(4, 5, 5, 5, 5)));
	assertEquals(8, new Foors().calculateScore(new Roll(4, 4, 5, 5, 5)));
	assertEquals(20, new Foors().calculateScore(new Roll(4, 4, 4, 4, 4)));
    }
}
