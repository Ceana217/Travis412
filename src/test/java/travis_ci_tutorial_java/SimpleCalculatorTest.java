package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	public void testMinus() {
	    SimpleCalculator calc = new SimpleCalculator();
	    assertEquals(calc.minus(5, 3), 2);
	}
	public void testMultiply() {
	    SimpleCalculator calc = new SimpleCalculator();
	    assertEquals(calc.multiply(4, 3), 12);
	}
	public void testDivide() {
	    SimpleCalculator calc = new SimpleCalculator();
	    assertEquals(calc.divide(10, 2), 5);
	}
}

