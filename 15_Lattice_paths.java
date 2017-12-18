// Created July, 2016

public class 15_Lattice_paths {
	public static void main(String[] args) {
		long num = 21, factorial = 1;
		for (long i = num; i > 0; i--)
			factorial = factorial * i;
		System.out.print(factorial);
		System.out.print(21);
	}
}
