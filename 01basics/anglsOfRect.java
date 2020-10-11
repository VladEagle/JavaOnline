/*
Даны два угла треугольника (в градусах). Определить, существует ли такой
треугольник, и если да,то будет ли он прямоугольным.
*/
public class anglsOfRect {
	public static void main(String[] args) {
		double a = 45;
		double b = 45;
		checkRect(a, b);
	}

	static void checkRect(double a, double b) {
		if(180-(a+b) > 0) {
			System.out.println("Треугольник существует.");
			if(a == 90 || b == 90 || 180-(a+b) == 90) System.out.println("Он Прямоугольный");
		} else {
			System.out.println("Такого треугольника не может существовать.");
		}
	}
}