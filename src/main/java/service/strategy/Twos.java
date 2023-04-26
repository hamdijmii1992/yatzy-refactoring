package service.strategy;

import domain.Roll;

public class Twos implements YatzyScoreCalculator{

    @Override
    public int calculateScore(Roll roll) {
	return roll.sumOf(2);
    }

}