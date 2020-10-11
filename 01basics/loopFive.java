/*
Даны числовой ряд и некоторое число е. Найти сумму тех
членов ряда, модуль которых больше или равен заданному е.
Общий член ряда имеет вид: (картинка)
*/
public class loopFive {
	public static void main(String[] args) {
		double num = 0.075; // insert you number
		System.out.println(getSumOfSeries(num));
	}

	static double getSumOfSeries(double num) {
		double sum = 0;
		int counter = 1;
		while (true) {
			double a = 1/Math.pow(2,counter)+1/Math.pow(3,counter);
			if (Math.abs(a) >= num) {
				sum += a;
				counter++;
				continue;

			} else {
				break;}
		}
		return sum;
	}
}