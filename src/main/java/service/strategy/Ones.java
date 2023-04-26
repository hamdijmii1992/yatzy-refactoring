package service.strategy;

import domain.Roll;

public class Ones implements YatzyScoreCalculator{

    @Override
    public int calculateScore(Roll roll) {
	return roll.sumOf(1);
    }

}
