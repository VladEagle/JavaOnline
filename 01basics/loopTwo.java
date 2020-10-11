/*
Вычислить значение функции на отрезке [a, b] с шагом H
*/
public class loopTwo {
	public static void main(String[] args) {
		System.out.println(getValue(-1));
	}

	static int getValue(int x) {
		int result = x <= 2? -x: x;
		return result;
	}
}