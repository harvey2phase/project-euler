// Created July, 2016

public class 5_Smallest_multiple {
	public static void main(String[] args) {
		int count = 2520;
		while (divisibleBy20(count) == false) {
			count += 20;
		}
		System.out.print(count);
	}

	public static boolean divisibleBy20 (int n) {
		if (n % 3 != 0)
			return false;
		if (n % 7 != 0 || n % 8 != 0 || n % 9 != 0)
			return false;
		if (n % 11 != 0 || n % 12 != 0 || n % 13 != 0)
			return false;
		if (n % 16 != 0 || n % 17 != 0 || n % 19 != 0)
			return false;
		return true;
	}

}
