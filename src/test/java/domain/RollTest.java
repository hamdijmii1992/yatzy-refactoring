package domain;

import org.junit.Test;

public class RollTest {

    @Test(expected = IllegalArgumentException.class)
    public void testRollValueLowerThanOne() {
	new Roll(2, 1, 0, 2, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRollValueGreaterThanSix() {
	new Roll(2, 1, 8, 2, 4);
    }

}
