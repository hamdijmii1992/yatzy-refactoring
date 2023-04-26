package service.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import domain.Roll;

public class FourOfaKindTest {

    @Test
    public void testFourOfaKind() {
	int expected = 0;
	int actual = new FourOfaKind().calculateScore(new Roll(3, 3, 2, 3, 5));
	assertEquals(expected, actual);
	assertEquals(12, new FourOfaKind().calculateScore(new Roll(3, 3, 3, 3, 5)));
	assertEquals(20, new FourOfaKind().calculateScore(new Roll(5, 5, 5, 4, 5)));
	assertEquals(12, new FourOfaKind().calculateScore(new Roll(3, 3, 3, 3, 3)));
	assertEquals(4, new FourOfaKind().calculateScore(new Roll(2, 1, 1, 1, 1)));
    }

}
