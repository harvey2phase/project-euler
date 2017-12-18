public class Problem4 {
	public static void main(String[] args) {
		int result = 0;
		for (int x = 100; x < 1000; x++) {
			for (int y = 100; y < 1000; y++) {
				int num = x*y;
				String number = Integer.toString(num);
				int length = number.length() - 1;
				String reverse = "";
				for (int i = length; i >= 0; i--)
					reverse += number.charAt(i);
				if (number.equals(reverse)){
					int reverseInt = Integer.parseInt(reverse);
					if (reverseInt > result)
						result = reverseInt;
				}
			}
		}
		System.out.print(result);
	}

}
