package service.strategy;

import domain.Roll;

public class Foors implements YatzyScoreCalculator{

    @Override
    public int calculateScore(Roll roll) {
	return roll.sumOf(4);
    }

}