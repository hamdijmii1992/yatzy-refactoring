package service.strategy;

import domain.Roll;

@FunctionalInterface
public interface YatzyScoreCalculator {
    int calculateScore(Roll roll);
}
