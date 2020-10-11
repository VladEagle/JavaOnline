/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения
*/
public class linearThree {
	public static void main(String[] args) {
		int x = 1; // insert your vars [x, y]
		int y = 2;
		System.out.println(getExp(x, y));
	}

	static double getExp(int x, int y) {
		double result = ( (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)) ) * Math.tan(x*y);
		return result;
	}
}