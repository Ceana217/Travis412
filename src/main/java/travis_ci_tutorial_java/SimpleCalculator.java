package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}
	public int minus(int a, int b) {
	    return a - b;
	}	
	public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return dividend / divisor;
    }
}
