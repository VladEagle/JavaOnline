/*
Для каждого натурального числа в промежутке от m до n вывести
все делители, кроме единицы и самого числа. m и n вводятся
с клавиатуры.
*/
import java.util.Scanner;
public class loopSeven {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите промежуток m-n для нахождения всех делителей");
		String m = in.nextLine();
		String n = in.nextLine();
		getAllDen(Integer.parseInt(m), Integer.parseInt(n));
	}

	//get all denominators of all numbers
	static void getAllDen(int m, int n) {
		for(;m <= n; m++) {
			getDen(m);
		}
	}

	//get all denominators of the number
	static void getDen(int x) {
		System.out.println("Все делители числа: " + x);
		for(int i = 2; i < x; i++) {
			if (x == 2) break;
			if (x % i == 0) {
				System.out.println("  "+i);
			}
		}
	}
}
