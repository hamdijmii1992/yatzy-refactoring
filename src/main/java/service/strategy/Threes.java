package service.strategy;

import domain.Roll;

public class Threes implements YatzyScoreCalculator{

    @Override
    public int calculateScore(Roll roll) {
	return roll.sumOf(3);
    }

}