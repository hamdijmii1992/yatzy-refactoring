package service.strategy;

import domain.Roll;

public class Yatzy implements YatzyScoreCalculator {

    @Override
    public int calculateScore(Roll roll) {
	if (roll.intStream().distinct().count() == 1) {
	    return 50;
	}
	return 0;
    }

}
