package service.strategy;

import java.util.List;
import java.util.stream.Collectors;

import domain.Roll;

public class TwoPair implements YatzyScoreCalculator {

    @Override
    public int calculateScore(Roll roll) {
	List<Integer> twoPairDice = roll.ofaKind(2).collect(Collectors.toList());
	if (twoPairDice.size() == 2) {
	    return twoPairDice.stream().mapToInt(d -> d).sum() * 2;
	}
	return 0;
    }

}
