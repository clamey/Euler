package lancers;

public class EulerProblem5_1 implements Problem {

	@Override
	public long solve() {
        long result = 1;
        while (true) {
            boolean pass = true;
            for (int i=1; i<=20; i++) {
                if (result % i !=0 ) {
                	pass = false;
                    break;
                }
            }
            if (pass) {
            	break;
            }
            result++;
        }
        return result;
	}
}
