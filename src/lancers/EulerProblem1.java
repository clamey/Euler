package lancers;
public class EulerProblem1 implements Problem {

	public long solve() {
		long result = 0;
		
		for (int i=0; i<1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				// System.out.println(i);
				result += i;
			}
		}
		
		return result;
	}

}
