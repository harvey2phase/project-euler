// Created July, 2016

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 18_Maximum_path_sum_I {
	public static void main(String[] args) {
		ArrayList<ArrayList> rowList = new ArrayList<ArrayList>(); //The ArrayList to contain ArrayList of numbers
		System.out.println("Please enter triangle here: ");
		Scanner s = new Scanner(System.in);
		String rowI = s.nextLine(); //Each row of numbers
		for (int i = 1; i < 15; i++) {
			StringTokenizer t = new StringTokenizer (rowI, " ");
			ArrayList<Integer> rowNums = new ArrayList<Integer>(); //The ArrayList to contain individual numbers
			while (t.hasMoreTokens()) {
				int num = Integer.parseInt(t.nextToken());
				rowNums.add(num);
			}
			rowList.add(rowNums);
			rowI = s.nextLine();
		}
		System.out.println(rowList);
		int sum = 0;
		for (int i = 0; i < rowList.size(); i++) {
			ArrayList<Integer> rowNums = new ArrayList<Integer>(rowList.get(i));
			for (int j = 0; j < rowNums.size(); i++) {
				
			}
		}
	}
}
