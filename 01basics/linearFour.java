/*
Дано действительное число R вида nnn.ddd (три цифры разряда в дробной
и целой частях). Поменять местами дробную и целую части числа и вывести
полученное значение числа.
*/
public class linearFour {
	public static void main(String[] args) {
		double x = 123.456; // insert your Num
		changeDig(x);
	}

	static void changeDig(double x) {
		int integ = (int)x; // get integer part of num
		int fl = (int) ((x-integ)*1000); // get float part of num
		
		Double result = Double.parseDouble(fl+"."+integ);
		System.out.println(result);

	}
}