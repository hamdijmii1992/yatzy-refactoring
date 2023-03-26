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
    public void chance_scores_sum_of_all_dice() {
	int expected = 15;
	int actual = Yatzy.chance(2, 3, 4, 5, 1);
	assertEquals(expected, actual);
	assertEquals(16, Yatzy.chance(3, 3, 4, 5, 1));
    }

    @Test
    public void yatzy_scores_50() {
	int expected = 50;
	int actual = Yatzy.yatzy(4, 4, 4, 4, 4);
	assertEquals(expected, actual);
	assertEquals(50, Yatzy.yatzy(6, 6, 6, 6, 6));
	assertEquals(0, Yatzy.yatzy(6, 6, 6, 6, 3));
    }

    @Test
    public void smallStraight() {
	assertEquals(15, Yatzy.smallStraight(1, 2, 3, 4, 5));
	assertEquals(15, Yatzy.smallStraight(2, 3, 4, 5, 1));
	assertEquals(0, Yatzy.smallStraight(1, 2, 2, 4, 5));
    }

    @Test
    public void largeStraight() {
	assertEquals(20, Yatzy.largeStraight(6, 2, 3, 4, 5));
	assertEquals(20, Yatzy.largeStraight(2, 3, 4, 5, 6));
	assertEquals(0, Yatzy.largeStraight(1, 2, 2, 4, 5));
    }

    @Test
    public void three_of_a_kind() {
	assertEquals(9, Yatzy.three_of_a_kind(3, 3, 3, 4, 5));
	assertEquals(15, Yatzy.three_of_a_kind(5, 3, 5, 4, 5));
	assertEquals(9, Yatzy.three_of_a_kind(3, 3, 3, 3, 5));
    }

    @Test
    public void four_of_a_knd() {
	assertEquals(12, Yatzy.four_of_a_kind(3, 3, 3, 3, 5));
	assertEquals(20, Yatzy.four_of_a_kind(5, 5, 5, 4, 5));
	assertEquals(9, Yatzy.three_of_a_kind(3, 3, 3, 3, 3));
    }

    @Test
    public void one_pair() {
	assertEquals(6, Yatzy.score_pair(3, 4, 3, 5, 6));
	assertEquals(10, Yatzy.score_pair(5, 3, 3, 3, 5));
	assertEquals(12, Yatzy.score_pair(5, 3, 6, 6, 5));
    }

    @Test
    public void two_Pair() {
	assertEquals(16, Yatzy.two_pair(3, 3, 5, 4, 5));
	assertEquals(16, Yatzy.two_pair(3, 3, 5, 5, 5));
    }

    @Test
    public void fullHouse() {
	assertEquals(18, Yatzy.fullHouse(6, 2, 2, 2, 6));
	assertEquals(0, Yatzy.fullHouse(2, 3, 4, 5, 6));
    }
}
