package service.strategy;

import domain.Roll;

public class Sixes implements YatzyScoreCalculator{

    @Override
    public int calculateScore(Roll roll) {
	return roll.sumOf(6);
    }

}