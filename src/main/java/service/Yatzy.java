package service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import domain.Roll;

public class Yatzy {

    private final Roll roll;

    public Yatzy(Roll roll) {
	this.roll = roll;
    }

    public int ones() {
	return roll.sumOf(1);
    }

    public int twos() {
	return roll.sumOf(2);
    }

    public int threes() {
	return roll.sumOf(3);
    }

    public int fours() {
	return roll.sumOf(4);
    }

    public int fives() {
	return roll.sumOf(5);
    }

    public int sixes() {
	return roll.sumOf(6);
    }

    public int chance() {
	return roll.sumAll();
    }

    public int yatzy() {
	if (roll.intStream().distinct().count() == 1) {
	    return 50;
	}
	return 0;
    }

    public int pair() {
	Optional<Integer> maxPair = roll.ofaKind(2).sorted(Comparator.reverseOrder()).findFirst();
	return 2 * maxPair.orElse(0);
    }

    public int twoPair() {
	List<Integer> twoPairDice = roll.ofaKind(2).collect(Collectors.toList());
	if (twoPairDice.size() == 2) {
	    return twoPairDice.stream().mapToInt(d -> d).sum() * 2;
	}
	return 0;
    }

    public int threeOfaKind() {
	return 3 * roll.ofaKind(3).findFirst().orElse(0);
    }

    public int fourOfaKind() {
	return 4 * roll.ofaKind(4).findFirst().orElse(0);
    }

    public int smallStraight() {
	if (roll.isStraight(d -> d != 6)) {
	    return 15;
	}
	return 0;
    }

    public int largeStraight() {
	if (roll.isStraight(d -> d != 1)) {
	    return 20;
	}
	return 0;
    }

    public int fullHouse() {
	int sumOfPair = pair();
	if (sumOfPair == 0)
	    return 0;
	int sumOfThrees = threeOfaKind();
	if (sumOfThrees == 0 || (sumOfThrees / 3) == (sumOfPair / 2))
	    return 0;

	return sumOfPair + sumOfThrees;

    }

}
