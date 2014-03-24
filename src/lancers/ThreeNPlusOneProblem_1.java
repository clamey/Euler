package lancers;

public class ThreeNPlusOneProblem_1 implements Problem {

	@Override
	public long solve() {
        long start = System.currentTimeMillis();
		long x = getCycleLength(4000000000000L);
        long stop = System.currentTimeMillis();
        System.out.println("#1 : " + start + " " + stop);
        return x;
	}
    
	public long getCycleLength(long l) {
        if (l <= 1) {
			return 1;
		}
		if (l % 2 == 0) {
			return getCycleLength(l / 2) + 1;
		} else {
			return getCycleLength(3 * l + 1) + 1;
		}
	}
    
}