// Created July, 2016

public class 20_Factorial_digit_sum {
	public static void main(String[] args) {
		double factor = 1;
		for (double i = 10; i > 0; i--)
			factor = factor * i;
		String factorS = Double.toString(factor);
		System.out.println(factorS);
	}
}
