package domain;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Roll {

    private final int[] dice;

    public Roll(int d1, int d2, int d3, int d4, int d5) {
	dice = new int[] { d1, d2, d3, d4, d5 };
	if (stream().anyMatch(d -> (d > 6 || d < 1))) {
	    throw new IllegalArgumentException("dice numbers must be between 1 and 6");
	}

    }

    public int sumOf(int die) {
	return intStream().filter(d -> d == die).sum();
    }

    public int sumAll() {
	return intStream().sum();
    }

    public IntStream intStream() {
	return IntStream.of(dice);
    }

    public Stream<Integer> stream() {
	return IntStream.of(dice).boxed();
    }

    public Stream<Integer> ofaKind(int frequency) {
	Map<Integer, Long> frequencies = calculateFrequencies();
	return frequencies.entrySet().stream().filter(entry -> entry.getValue() >= frequency)
		.map(entry -> entry.getKey());
    }

    private Map<Integer, Long> calculateFrequencies() {
	return stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public boolean isStraight(Predicate<Integer> predicate) {
	return (stream().distinct().filter(predicate).count() == 5);
    }

}
