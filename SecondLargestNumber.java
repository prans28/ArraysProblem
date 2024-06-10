package Array;

public class SecondLargestNumber  {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 7, 9 };
		int as = secondLargestNumber(a);

		System.out.println(as);
	}

	private static int secondLargestNumber(int[] a) {
		int first = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > first) {
				first = a[i];
			}
		}

		int second = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > second && a[i] < first) {
				second = a[i];
			}
		}

		return second;
	}

}
