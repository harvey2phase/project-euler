public class Problem20 {
	public static void main(String[] args) {
		double factor = 1;
		for (double i = 10; i > 0; i--)
			factor = factor * i;
		String factorS = Double.toString(factor);
		System.out.println(factorS);
	}
}
