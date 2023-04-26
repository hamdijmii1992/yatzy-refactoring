package service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import domain.Roll;
import service.strategy.Chance;
import service.strategy.Fives;
import service.strategy.Foors;
import service.strategy.FourOfaKind;
import service.strategy.FullHouse;
import service.strategy.LargeStraight;
import service.strategy.Ones;
import service.strategy.Pair;
import service.strategy.Sixes;
import service.strategy.SmallStraight;
import service.strategy.ThreeOfaKind;
import service.strategy.Threes;
import service.strategy.TwoPair;
import service.strategy.Twos;
import service.strategy.Yatzy;

public class YatzyGameTest {

    @Test
    public void testOnes() {
	int expected = 1;
	int actual = new YatzyGame(new Ones()).calculateScore(new Roll(1, 2, 2, 4, 5));
	assertEquals(expected, actual);
    }

    @Test
    public void testTwos() {
	int expected = 4;
	int actual = new YatzyGame(new Twos()).calculateScore(new Roll(1, 2, 3, 2, 6));
	assertEquals(expected, actual);

    }

    @Test
    public void testThrees() {
	int expected = 3;
	int actual = new YatzyGame(new Threes()).calculateScore(new Roll(1, 2, 5, 2, 3));
	assertEquals(expected, actual);
    }

    @Test
    public void testFours() {
	int expected = 4;
	int actual = new YatzyGame(new Foors()).calculateScore(new Roll(4, 5, 5, 5, 5));
	assertEquals(expected, actual);

    }

    @Test
    public void testFives() {
	int expected = 5;
	int actual = new YatzyGame(new Fives()).calculateScore(new Roll(4, 4, 4, 3, 5));
	assertEquals(expected, actual);
    }

    @Test
    public void testSixes() {
	int expected = 6;
	int actual = new YatzyGame(new Sixes()).calculateScore(new Roll(4, 4, 6, 5, 5));
	assertEquals(expected, actual);
    }

    @Test
    public void testChance() {
	int expected = 15;
	int actual = new YatzyGame(new Chance()).calculateScore(new Roll(2, 3, 4, 5, 1));
	assertEquals(expected, actual);
    }

    @Test
    public void testYatzy() {
	int expected = 50;
	int actual = new YatzyGame(new Yatzy()).calculateScore(new Roll(4, 4, 4, 4, 4));
	assertEquals(expected, actual);
    }

    @Test
    public void testSmallStraight() {
	int expected = 15;
	int actual = new YatzyGame(new SmallStraight()).calculateScore(new Roll(1, 2, 3, 4, 5));
	assertEquals(expected, actual);
    }

    @Test
    public void testLargeStraight() {
	int expected = 20;
	int actual = new YatzyGame(new LargeStraight()).calculateScore(new Roll(6, 2, 3, 4, 5));
	assertEquals(expected, actual);
    }

    @Test
    public void testThreeOfaKind() {
	int expected = 9;
	int actual = new YatzyGame(new ThreeOfaKind()).calculateScore(new Roll(3, 3, 3, 4, 5));
	assertEquals(expected, actual);
    }

    @Test
    public void testFourOfaKind() {
	int expected = 12;
	int actual = new YatzyGame(new FourOfaKind()).calculateScore(new Roll(3, 3, 3, 3, 5));
	assertEquals(expected, actual);
    }

    @Test
    public void testPair() {
	int expected = 6;
	int actual = new YatzyGame(new Pair()).calculateScore(new Roll(3, 4, 3, 5, 6));
	assertEquals(expected, actual);
    }

    @Test
    public void testTwoPair() {
	int expected = 16;
	int actual = new YatzyGame(new TwoPair()).calculateScore(new Roll(3, 3, 5, 4, 5));
	assertEquals(expected, actual);
    }

    @Test
    public void fullHouseTest() {
	int expected = 18;
	int actual = new YatzyGame(new FullHouse()).calculateScore(new Roll(6, 2, 2, 2, 6));
	assertEquals(expected, actual);
    }
}
