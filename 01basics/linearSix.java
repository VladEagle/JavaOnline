/*
Для данной области составить линейную программу, которая печатает 
true, если точка с координатами (x, y) принадлежит закрашенной
области, и false - в противном случае.
*/
public class linearSix {
	public static void main(String[] args) {
		double x = 2; // insert your X
		double y = 3; // insert your Y
		System.out.println(isInArea(x, y));
	}

	static boolean isInArea(double x, double y) {
		if (y > 0 && y <= 4) {
			return Math.abs(x) <= 2;
		} else if (y <= 0 && y >= -3){
			return Math.abs(x) <= 4;
		} else {
			return false;
		}
	}
}