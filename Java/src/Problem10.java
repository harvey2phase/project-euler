// Find the sum of all the primes below two million (2,000,000).

public class Problem10 {
	public static void main(String[] args) {
		long sum = 5;
		for (int i = 5; i <= 2000000; i += 2)
			if (isPrime(i))
				sum += i;
		System.out.print(sum);
	}

	public static boolean isPrime(int n) {
		for (int i = 3; i * i <= n; i += 2)
			if (n % i == 0)
				return false;
		return true;
	}
}
