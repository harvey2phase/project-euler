public class Problem7 {
	public static void main(String[] args) {
		int count = 1, prime = 3, n = 3;
		while (count <= 10000) {
			if (isPrime(n)){
				prime = n;
				count++;
			}
			n += 2;
		}
		System.out.print(prime);
	}

	public static boolean isPrime(int n) {
		for (int i = 3; i*i <= n; i += 2)
			if (n % i == 0)
				return false;
		return true;
	}
}
