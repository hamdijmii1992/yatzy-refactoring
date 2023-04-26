package service.strategy;

import domain.Roll;

public class ThreeOfaKind implements YatzyScoreCalculator {

    @Override
    public int calculateScore(Roll roll) {
	return 3 * roll.ofaKind(3).findFirst().orElse(0);
    }

}
