/*
Составить программу нахождения произведения квадратов первых двухсот чисел
*/
public class loopFour {
	public static void main(String[] args) {
		int mul = 1;
		for(int i = 1; i <= 200; mul *= Math.pow(i++, 2)) {}
		System.out.println(mul);
	}
}