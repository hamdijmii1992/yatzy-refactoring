import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Yatzy {

    private final int[] dice;

    public Yatzy(int d1, int d2, int d3, int d4, int d5) {
	if (IntStream.of(d1, d2, d3, d4, d5).anyMatch(d -> (d > 6 || d < 1))) {
	    throw new IllegalArgumentException("dice numbers must be between 1 and 6");
	}
	dice = new int[5];
	dice[0] = d1;
	dice[1] = d2;
	dice[2] = d3;
	dice[3] = d4;
	dice[4] = d5;
    }

    public int ones() {
	return sumOf(1);
    }

    public int twos() {
	return sumOf(2);
    }

    public int threes() {
	return sumOf(3);
    }

    public int fours() {
	return sumOf(4);
    }

    public int fives() {
	return sumOf(5);
    }

    public int sixes() {
	return sumOf(6);
    }

    private int sumOf(int die) {
	return IntStream.of(dice).filter(d -> d == die).sum();
    }

    public int chance() {
	return IntStream.of(dice).sum();
    }

    public int yatzy() {
	if (IntStream.of(dice).distinct().count() == 1) {
	    return 50;
	}
	return 0;
    }

    public int smallStraight() {
	if (isStraight(d -> d != 6)) {
	    return 15;
	}
	return 0;
    }

    public int largeStraight() {
	if (isStraight(d -> d != 1)) {
	    return 20;
	}
	return 0;
    }

    private boolean isStraight(Predicate<Integer> predicate) {
	return (IntStream.of(dice).distinct().boxed().filter(predicate).count() == 5);
    }

    public int threeOfaKind() {
	return 3 * ofaKind(3);
    }

    public int fourOfaKind() {
	return 4 * ofaKind(4);
    }

    private int ofaKind(int frequency) {
	Map<Integer, Long> frequencies = calculateFrequencies();
	return frequencies.entrySet().stream().filter(entry -> entry.getValue() >= frequency)
		.map(entry -> entry.getKey()).findFirst().orElse(0);
    }

    private Map<Integer, Long> calculateFrequencies() {
	return IntStream.of(dice).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static int score_pair(int d1, int d2, int d3, int d4, int d5) {
	int[] counts = new int[6];
	counts[d1 - 1]++;
	counts[d2 - 1]++;
	counts[d3 - 1]++;
	counts[d4 - 1]++;
	counts[d5 - 1]++;
	int at;
	for (at = 0; at != 6; at++)
	    if (counts[6 - at - 1] >= 2)
		return (6 - at) * 2;
	return 0;
    }

    public static int two_pair(int d1, int d2, int d3, int d4, int d5) {
	int[] counts = new int[6];
	counts[d1 - 1]++;
	counts[d2 - 1]++;
	counts[d3 - 1]++;
	counts[d4 - 1]++;
	counts[d5 - 1]++;
	int n = 0;
	int score = 0;
	for (int i = 0; i < 6; i += 1)
	    if (counts[6 - i - 1] >= 2) {
		n++;
		score += (6 - i);
	    }
	if (n == 2)
	    return score * 2;
	else
	    return 0;
    }

    public static int fullHouse(int d1, int d2, int d3, int d4, int d5) {
	int[] tallies;
	boolean _2 = false;
	int i;
	int _2_at = 0;
	boolean _3 = false;
	int _3_at = 0;

	tallies = new int[6];
	tallies[d1 - 1] += 1;
	tallies[d2 - 1] += 1;
	tallies[d3 - 1] += 1;
	tallies[d4 - 1] += 1;
	tallies[d5 - 1] += 1;

	for (i = 0; i != 6; i += 1)
	    if (tallies[i] == 2) {
		_2 = true;
		_2_at = i + 1;
	    }

	for (i = 0; i != 6; i += 1)
	    if (tallies[i] == 3) {
		_3 = true;
		_3_at = i + 1;
	    }

	if (_2 && _3)
	    return _2_at * 2 + _3_at * 3;
	else
	    return 0;
    }
}
