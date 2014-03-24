package lancers;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;


public class EulerProblemTest {

	@Test
	public void testProblem1() {
		Problem problem = new EulerProblem1();
		assertEquals(233168, problem.solve());
	}
	
	@Test
	public void testProblem2() {
		Problem problem = new EulerProblem2();
		assertEquals(4613732, problem.solve());
	}
	
	@Test
	public void testProblem3() {
		Problem problem = new EulerProblem3();
		assertEquals(6857, problem.solve());
	}
    
	@Test
	public void testProblem4() {
		Problem problem = new EulerProblem4();
		assertEquals(906609, problem.solve());
	}
    
	@Ignore
	public void testProblem5_1() {
		Problem problem = new EulerProblem5_1();
		assertEquals(232792560, problem.solve());
	}
    
	@Test
	public void testProblem5_2() {
		Problem problem = new EulerProblem5_2();
		assertEquals(232792560, problem.solve());
	}
    
	@Test
	public void testThreeNPlusOneProblem_1() {
		Problem problem = new ThreeNPlusOneProblem_1();
		assertEquals(149, problem.solve());
	}
    
	@Test
	public void testThreeNPlusOneProblem_2() {
		Problem problem = new ThreeNPlusOneProblem_2();
		assertEquals(149, problem.solve());
	}

}
