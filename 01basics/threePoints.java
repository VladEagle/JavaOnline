/*
Даны координаты трех точек. Определить будут ли они расположены на одной прямой.
*/
public class threePoints {
	public static void main(String[] args) {
		System.out.println(isLine(1,1,2,2,4,4));
	}

	static boolean isLine(double x1, double y1, double x2, double y2, double x3, double y3) {
		double m = (y2-y1) / (x2-x1); // find X in y=ax+b
		double y = m*(x3-x1)+y1; // find Y in y=ax+b
		return y == y3; // check if Y in y=ax+b equals y3
	}
}