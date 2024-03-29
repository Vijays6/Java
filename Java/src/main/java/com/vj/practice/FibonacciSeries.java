package com.vj.practice;

public class FibonacciSeries {
	private static long[] fibonacciTemp;

	public static void main(String[] args) {
		int n = 2;
		fibonacciTemp = new long[n + 1];
		for(int i=0;i<=n;i++) {
		System.out.print(generateFibonacci(i)+" ");
		}
	}

	public static long generateFibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		if (fibonacciTemp[n] != 0) {
			return fibonacciTemp[n];
		}
		long nthFibonacciNum = generateFibonacci(n - 1) + generateFibonacci(n - 2);
		fibonacciTemp[n] = nthFibonacciNum;

		return nthFibonacciNum;
	}
}
