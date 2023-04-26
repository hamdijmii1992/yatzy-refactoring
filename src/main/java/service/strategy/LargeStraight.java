package service.strategy;

import domain.Roll;

public class LargeStraight implements YatzyScoreCalculator {

    @Override
    public int calculateScore(Roll roll) {
	if (roll.isStraight(d -> d != 1)) {
	    return 20;
	}
	return 0;
    }

}
