package vn.khanhpdt.playgrounds.projecteuler;

/**
 * @see <a href="https://projecteuler.net/problem=1">Problem 1</a>
 * @author khanhpdt
 */
public class MultipleThreeOrFive {

	public static void solutionOne() {
		final int n = 1_000;

		int result = 0;
		for (int i = 1; i < n; i ++) {
			if (i % 3 == 0 || i % 5 == 0) {
				result += i;
			}
		}

		System.out.println(result);
	}

	public static void main(String[] args) {
		System.out.println(solutionTwo(1000000000));
	}

	private static long solutionTwo(int n) {
		return 3 * sumUntil(getMaxMultiple(n, 3)) + 5 * sumUntil(getMaxMultiple(n, 5)) - 15 * sumUntil(getMaxMultiple(n, 15));
	}

	private static int getMaxMultiple(int n, int k) {
		return n % k == 0 ? n / k : (n / k) + 1;
	}

	private static long sumUntil(long maxExclusive) {
		return ((maxExclusive - 1) * maxExclusive) / 2;
	}

}
