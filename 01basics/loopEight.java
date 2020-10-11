/*
Даны два числа. Определить цифры, входящие в запись как первого,
так и второго числа.
*/

import java.util.Arrays;
public class loopEight {
	public static void main(String[] args) {
		Integer a = 567;
		String b = a+"s";
		System.out.println(Arrays.toString(getSepNumbers(588879)));
		System.out.println(Arrays.toString(getSepNumbers(23)));
	}
	// get array of sep numbers from one big number
	static int[] getSepNumbers(int integ) {
		// Define the length of array
		Integer x = integ;
		String strNum = x.toString();
		int[] arr = new int[strNum.length()];

		for(int i = strNum.length()-1; i >= 0; i--) {
			arr[i] = x % 10;
			x = x/10;
		}

		return arr;
	}
}