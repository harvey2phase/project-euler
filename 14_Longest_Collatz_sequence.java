// Created July, 2016

public class 14_Longest_Collatz_sequence {
	public static void main(String[] args) {
		int count, num, largestCount = 0, largestNum = 0;
		for (int i = 1; i <= 1000000; i++) {
			count = 1;
			num = i;
			//System.out.print(num + " -> ");
			while (num != 1) {
				if (num % 2 == 0)
					num = num / 2;
				else
					num = 3 * num + 1;
				//System.out.print(num + " -> ");
				count++;
			}
			if (count > largestCount) {
				largestCount = count;
				largestNum = i;
			}
			//System.out.println("\n" + count);
		}
		System.out.println("\nLargest count: " + largestCount + "\nLargest Number: " + largestNum);
	}
}
