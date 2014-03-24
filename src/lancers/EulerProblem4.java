package lancers;

public class EulerProblem4 implements Problem {

	@Override
	public long solve() {
        
		long result = 0;

		for (long left = 999; left > 99; left--) {
			for (long right = 999; right > 99; right--) {

				long current = left * right;

				if (isPalindrome(current) && current > result) {
					result = current;
				}
			}
		}
		return result;
	}
    
	boolean isPalindrome(long number) {
        
		 long temp = number;
         long reversed = 0;
		 while (number > 0) {
		      long digit = number % 10;
		      reversed = reversed * 10 + digit;
		      number = number / 10;
		 }
        
		return temp == reversed;
	}

}
