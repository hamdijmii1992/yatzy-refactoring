package service.strategy;

import domain.Roll;

public class SmallStraight implements YatzyScoreCalculator {

    @Override
    public int calculateScore(Roll roll) {
	if (roll.isStraight(d -> d != 6)) {
	    return 15;
	}
	return 0;
    }

}
