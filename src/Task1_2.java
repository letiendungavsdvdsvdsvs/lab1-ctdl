
public class Task1_2 {

	public static int getFibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int f_n2 = getFibonacci(n - 2);
		int f_n1 = getFibonacci(n - 1);
		return f_n2 + f_n1;
	}

	public static void printFibonacci(int n) {
		if (n > 0) {
			System.out.print(getFibonacci(n - 1) + " ");
			printFibonacci(n - 1);
		} else
			return;
	}

	public static void main(String[] args) {
		System.out.println(getFibonacci(4));
		printFibonacci(10);
	}
}
