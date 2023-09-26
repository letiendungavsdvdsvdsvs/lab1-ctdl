
public class Task1_1 {
	public static int getSn1(int n) {
		if (n < 1)
			return 0;
		if (n % 2 == 0) {
			return -n + getSn1(n - 1);
		} else {
			return n + getSn1(n - 1);
		}
	}

	public static int getSn2(int n) {
		if (n == 0) {
			return 0;
		} else {
			return spGetSn2(n) + getSn2(n - 1);
		}
	}

	public static int spGetSn2(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * spGetSn2(n - 1);
		}
	}

	public static int getSn3(int n) {
		if (n < 1) {
			return 0;
		} else {
			return n * n + getSn3(n - 1);
		}
	}

	public static double getSn4(int n) {
		int i = n * 2;
		if (n == 0) {
			return 1;
		} else {
			return 1 / spGetSn4(i) + 1 / getSn4(i -= 2);
		}
	}

	public static int spGetSn4(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * spGetSn4(n - 2);
		}
	}

	public static void main(String[] args) {

		System.out.println(getSn1(4));
		System.out.println(getSn2(3));
		System.out.println(getSn3(3));
		System.out.println(getSn4(2));

	}
}
