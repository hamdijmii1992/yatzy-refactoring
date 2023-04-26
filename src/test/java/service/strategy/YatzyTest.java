package service.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import domain.Roll;

public class YatzyTest {

    @Test
    public void testYatzy() {
	int expected = 50;
	int actual = new Yatzy().calculateScore(new Roll(4, 4, 4, 4, 4));
	assertEquals(expected, actual);
	assertEquals(50, new Yatzy().calculateScore(new Roll(6, 6, 6, 6, 6)));
	assertEquals(0, new Yatzy().calculateScore(new Roll(6, 6, 6, 6, 3)));
    }

}
