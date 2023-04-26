package service.strategy;

import domain.Roll;

public class FourOfaKind implements YatzyScoreCalculator {

    @Override
    public int calculateScore(Roll roll) {
	return 4 * roll.ofaKind(4).findFirst().orElse(0);
    }

}
