package service.strategy;

import domain.Roll;

public class Chance implements YatzyScoreCalculator {

    @Override
    public int calculateScore(Roll roll) {
	return roll.sumAll();
    }
}