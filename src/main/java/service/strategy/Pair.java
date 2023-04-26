package service.strategy;

import java.util.Comparator;
import java.util.Optional;

import domain.Roll;

public class Pair implements YatzyScoreCalculator {

    @Override
    public int calculateScore(Roll roll) {
	Optional<Integer> maxPair = roll.ofaKind(2).sorted(Comparator.reverseOrder()).findFirst();
	return 2 * maxPair.orElse(0);
    }

}
