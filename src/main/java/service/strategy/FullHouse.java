package service.strategy;

import domain.Roll;

public class FullHouse implements YatzyScoreCalculator {

    @Override
    public int calculateScore(Roll roll) {
	int sumOfPair = new Pair().calculateScore(roll);
	if (sumOfPair == 0)
	    return 0;
	int sumOfThrees = new ThreeOfaKind().calculateScore(roll);
	if (sumOfThrees == 0 || (sumOfThrees / 3) == (sumOfPair / 2))
	    return 0;

	return sumOfPair + sumOfThrees;
    }

}
