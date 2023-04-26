package service;

import domain.Roll;
import service.strategy.YatzyScoreCalculator;

public class YatzyGame {

    private YatzyScoreCalculator yatzyScoreCalculator;

    public YatzyGame(YatzyScoreCalculator calculator) {
	this.yatzyScoreCalculator = calculator;
    }

    public int calculateScore(Roll roll) {
	return yatzyScoreCalculator.calculateScore(roll);
    }

}
