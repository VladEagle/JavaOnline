/*
Вычислить значение функции ( (a-3)*b/2 ) + c
*/
public class linearOne {
	public static void main(String[] args) {
		double a = 1; // insert your vars [a, b, c]
		double b = 2;
		double c = 3;
		System.out.println(getExp(a, b, c));
	}

	static double getExp(double a, double b, double c) {
		double result = ( (a-3)*b/2 ) + c;
		return result;
	}
}