 class Fibonacci {
	public static int fibonacci(int n) {
		if (n==1)
			return 0;
		if (n==2)
			return 1;

		return fibonacci(n-1) + fibonacci(n-2);
	}

	public static void main(String[] args) {
		System.out.println("Nth Fibonacci number:" + fibonacci(5));
	}
}