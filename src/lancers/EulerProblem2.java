package lancers;

public class EulerProblem2 implements Problem {

	@Override
	public long solve() {
        long rez = 0, i =0;
        while (true) {
        	long f = fibonnaci(i);
            if (f > 4000000) {
                break;
            }
            if (f % 2 == 0) {
                // System.out.println(f);
                rez += f;
            }
            i++;
        } 
        return rez;
	}

	public long fibonnaci(long n) {
		if (n <= 2) {
			return 1;
		}
		long x = fibonnaci(n - 1) + fibonnaci(n - 2);
		return x;
	}

}
