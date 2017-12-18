// Created July, 2016

import java.util.ArrayList;

public class 12_Highly_divisible_triangular_number {
	public static void main(String[] args) {
		
	}
	// Find half of the factors of integer n
	public static ArrayList factors (int n) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for (int i = 1; i*i <= n; i++)
			if (n % i == 0)
				factors.add(i);
		return factors;
	}
	
	public static int triangle (int x) {
		int num = 0;
		for (int i = 1; i <= x; i++)
			num += i;
		return num;
	}
}
