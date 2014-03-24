package lancers;

public class ThreeNPlusOneProblem_2 implements Problem {

	@Override
	public long solve() {
        long start = System.currentTimeMillis();
		long x = getCycleLength(4000000000000L);
        long stop = System.currentTimeMillis();
        System.out.println("#2 : " + start + " " + stop);
        return x;
	}

	private long getCycleLength(long number) {
        long count = 1;
		while (true) {
            if (number == 1) {
            	break;
            }
            
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = number * 3 + 1;
            }
            count++;
		}
        
		return count;
	}

}
