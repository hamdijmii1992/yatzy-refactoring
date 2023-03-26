import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class YatzyTest {

    @Test(expected = IllegalArgumentException.class)
    public void testDiceValueLowerThanOne() {
	new Yatzy(2, 1, 0, 2, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDiceValueGreaterThanSix() {
	new Yatzy(2, 1, 8, 2, 4);
    }

    @Test
    public void testOnes() {
	int expected = 0;
	int actual = new Yatzy(6, 2, 2, 4, 5).ones();
	assertEquals(expected, actual);
	assertEquals(1, new Yatzy(1, 2, 3, 4, 5).ones());
	assertEquals(2, new Yatzy(1, 2, 1, 4, 5).ones());
	assertEquals(5, new Yatzy(1, 1, 1, 1, 1).ones());
    }

    @Test
    public void testTwos() {
	int expected = 0;
	int actual = new Yatzy(1, 3, 4, 5, 6).twos();
	assertEquals(expected, actual);
	assertEquals(4, new Yatzy(1, 2, 3, 2, 6).twos());
	assertEquals(10, new Yatzy(2, 2, 2, 2, 2).twos());
	assertEquals(2, new Yatzy(6, 2, 4, 1, 6).twos());
    }

    @Test
    public void testThrees() {
	int expected = 0;
	int actual = new Yatzy(2, 1, 4, 5, 6).threes();
	assertEquals(expected, actual);
	assertEquals(3, new Yatzy(1, 2, 5, 2, 3).threes());
	assertEquals(6, new Yatzy(1, 2, 3, 2, 3).threes());
	assertEquals(15, new Yatzy(3, 3, 3, 3, 3).threes());
    }

    @Test
    public void testFours() {
	int expected = 0;
	int actual = new Yatzy(3, 5, 5, 5, 5).fours();
	assertEquals(expected, actual);
	assertEquals(4, new Yatzy(4, 5, 5, 5, 5).fours());
	assertEquals(8, new Yatzy(4, 4, 5, 5, 5).fours());
	assertEquals(20, new Yatzy(4, 4, 4, 4, 4).fours());
    }

    @Test
    public void testFives() {
	int expected = 0;
	int actual = new Yatzy(4, 3, 2, 1, 6).fives();
	assertEquals(expected, actual);
	assertEquals(5, new Yatzy(4, 4, 4, 3, 5).fives());
	assertEquals(10, new Yatzy(4, 4, 4, 5, 5).fives());
	assertEquals(25, new Yatzy(5, 5, 5, 5, 5).fives());
    }

    @Test
    public void testSixes() {
	int expected = 0;
	int actual = new Yatzy(4, 4, 4, 5, 5).sixes();
	assertEquals(expected, actual);
	assertEquals(6, new Yatzy(4, 4, 6, 5, 5).sixes());
	assertEquals(12, new Yatzy(1, 5, 6, 6, 5).sixes());
	assertEquals(30, new Yatzy(6, 6, 6, 6, 6).sixes());
    }

    @Test
    public void testChance() {
	int expected = 15;
	int actual = new Yatzy(2, 3, 4, 5, 1).chance();
	assertEquals(expected, actual);
	assertEquals(16, new Yatzy(3, 3, 4, 5, 1).chance());
    }

    @Test
    public void testYatzy() {
	int expected = 50;
	int actual = new Yatzy(4, 4, 4, 4, 4).yatzy();
	assertEquals(expected, actual);
	assertEquals(50, new Yatzy(6, 6, 6, 6, 6).yatzy());
	assertEquals(0, new Yatzy(6, 6, 6, 6, 3).yatzy());
    }

    @Test
    public void testSmallStraight() {
	int expected = 0;
	int actual = new Yatzy(1, 2, 2, 4, 5).smallStraight();
	assertEquals(expected, actual);
	assertEquals(15, new Yatzy(1, 2, 3, 4, 5).smallStraight());
	assertEquals(15, new Yatzy(2, 3, 4, 5, 1).smallStraight());
    }

    @Test
    public void testLargeStraight() {
	int expected = 0;
	int actual = new Yatzy(1, 2, 2, 4, 5).largeStraight();
	assertEquals(expected, actual);
	assertEquals(20, new Yatzy(6, 2, 3, 4, 5).largeStraight());
	assertEquals(20, new Yatzy(2, 3, 4, 5, 6).largeStraight());
    }

    @Test
    public void testThreeOfaKind() {
	int expected = 0;
	int actual = new Yatzy(3, 2, 3, 4, 5).threeOfaKind();
	assertEquals(expected, actual);
	assertEquals(9, new Yatzy(3, 3, 3, 4, 5).threeOfaKind());
	assertEquals(15, new Yatzy(5, 3, 5, 4, 5).threeOfaKind());
	assertEquals(9, new Yatzy(3, 3, 3, 3, 5).threeOfaKind());
	assertEquals(6, new Yatzy(2, 2, 2, 3, 5).threeOfaKind());
    }

    @Test
    public void testFourOfaKind() {
	int expected = 0;
	int actual = new Yatzy(3, 3, 2, 3, 5).fourOfaKind();
	assertEquals(expected, actual);
	assertEquals(12, new Yatzy(3, 3, 3, 3, 5).fourOfaKind());
	assertEquals(20, new Yatzy(5, 5, 5, 4, 5).fourOfaKind());
	assertEquals(12, new Yatzy(3, 3, 3, 3, 3).fourOfaKind());
	assertEquals(4, new Yatzy(2, 1, 1, 1, 1).fourOfaKind());
    }

    @Test
    public void testPair() {
	int expected = 0;
	int actual = new Yatzy(2, 4, 3, 5, 6).pair();
	assertEquals(expected, actual);
	assertEquals(6, new Yatzy(3, 4, 3, 5, 6).pair());
	assertEquals(10, new Yatzy(5, 3, 3, 3, 5).pair());
	assertEquals(12, new Yatzy(5, 3, 6, 6, 5).pair());
    }

    @Test
    public void testTwoPair() {
	int expected = 0;
	int actual = new Yatzy(3, 3, 4, 3, 5).twoPair();
	assertEquals(expected, actual);
	assertEquals(16, new Yatzy(3, 3, 5, 4, 5).twoPair());
	assertEquals(16, new Yatzy(3, 3, 5, 5, 5).twoPair());
	assertEquals(12, new Yatzy(2, 2, 4, 1, 4).twoPair());
    }

    @Test
    public void fullHouse() {
	assertEquals(18, Yatzy.fullHouse(6, 2, 2, 2, 6));
	assertEquals(0, Yatzy.fullHouse(2, 3, 4, 5, 6));
    }
}
