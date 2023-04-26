package service.strategy;

import domain.Roll;

public class Fives implements YatzyScoreCalculator{

    @Override
    public int calculateScore(Roll roll) {
	return roll.sumOf(5);
    }

}