/*
найти max{min(a,b), min(c,d)}
*/
public class maxOfMins {
	public static void main(String[] args) {
		double a = 1;
		double b = 2;
		double c = 3;
		double d = 4;
		double result = Math.max(Math.min(a,b), Math.min(c,d));
		System.out.println(result);
	}
}