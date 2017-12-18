// Created July, 2016

public class 6_Sum_square_difference {
	public static void main(String[] args) {
		int squaresSum = 0, sumSquared = 0;
		for (int i = 1; i <= 100; i++) {
			squaresSum += i*i;
		}
		sumSquared = ((1+100)*100/2)*((1+100)*100/2);
		System.out.print(squaresSum + "\n" + sumSquared + "\n" + (sumSquared - squaresSum));
	}
}
