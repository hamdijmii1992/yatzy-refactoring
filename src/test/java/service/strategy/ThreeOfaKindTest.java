package service.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import domain.Roll;

public class ThreeOfaKindTest {

    @Test
    public void testThreeOfaKind() {
	int expected = 0;
	int actual = new ThreeOfaKind().calculateScore(new Roll(3, 2, 3, 4, 5));
	assertEquals(expected, actual);
	assertEquals(9, new ThreeOfaKind().calculateScore(new Roll(3, 3, 3, 4, 5)));
	assertEquals(15, new ThreeOfaKind().calculateScore(new Roll(5, 3, 5, 4, 5)));
	assertEquals(9, new ThreeOfaKind().calculateScore(new Roll(3, 3, 3, 3, 5)));
	assertEquals(6, new ThreeOfaKind().calculateScore(new Roll(2, 2, 2, 3, 5)));
    }
}
