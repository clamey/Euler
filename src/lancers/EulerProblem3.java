package lancers;

public class EulerProblem3 implements Problem {

	@Override
	public long solve() {
		long result = 600851475143L;
		while (true) {
			long factor = getFactor(result);
			if (factor < result) {
				result /= factor;
				// System.out.println("Result : " + result);
			} else {
				break;
			}
		}
		return result;
	}
	
	public static long getFactor(long n) {
		for (long i=2, end = (long) Math.sqrt(n); i<end; i++) {
			if (n % i == 0) {
				// System.out.println("Factor : " + i);
				return i;
			}
		}
		// System.out.println("Factor : " + n);		
		return n;
	}

}
