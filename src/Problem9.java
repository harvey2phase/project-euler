// THIS WHOLE CODE IS RUBBISH

//Largest set: 332-334
public class Problem9 {
	public static void main(String[] args) {
		int num = 1;
		while (triplet(num) == false && num < 32) {
			num ++;
		}
		System.out.print(num);
	}

	public static boolean triplet(int n) {
		if (n * n + (n + 1) * (n + 1) + (n + 2) * (n + 2) == 1000)
			return true;
		return false;
	}
}
