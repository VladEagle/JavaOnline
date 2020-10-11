/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения
*/
public class linearTwo {
	public static void main(String[] args) {
		int a = 1; // insert your vars [a, b, c]
		int b = 2;
		int c = 3;
		System.out.println(getExp(a, b, c));
	}

	static double getExp(int a, int b, int c) {
		double result = ( (b+Math.sqrt(Math.pow(b, 2)+4*a*c))/(2*a) ) - Math.pow(a, 3)*c+1/Math.pow(b, 2);
		return result;
	}
}