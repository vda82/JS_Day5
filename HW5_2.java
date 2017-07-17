package day5.HWmethods;

import java.util.Arrays;

public class HW5_2 {

	public static void main(String[] args) {
		int [] a = {10,30,50,58,99};
		int sum3 = a[0] + a[1] + a[2];
		System.out.println("sum is " + sum3);
		System.out.println("initial array is" + Arrays.toString(a));
		

	}
	static int newsum (int int1, int int2, int int3) {
		int result = int1 + int2 + int3;
		return result;
	}

}
