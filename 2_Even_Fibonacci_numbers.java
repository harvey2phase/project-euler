// Created July, 2016

import java.util.ArrayList;

public class 2_Even_Fibonacci_numbers {
	public static void main (String [] args) {
		ArrayList<Integer> sequence = new ArrayList<Integer>();
		sequence.add(1);
		int f = 2, sum = 0;
		for (int i = 0; f < 4000000; i++) {
			sequence.add(f);
			f += sequence.get(i);
		}
		System.out.println("Fibonacci sequence up to four million:\n "+sequence+"\n");
		for (int i = sequence.size()-1; i >= 0; i--)
			if (sequence.get(i)%2 != 0)
				sequence.remove(i);
		System.out.println("Even numbers in Fibonacci sequence up to four million:\n "+sequence+"\n");
		for (int i = 0; i < sequence.size(); i++)
			sum += sequence.get(i);
		System.out.println("Sum:\n "+sum);
	}
}