/*
Дано натуральное число Т, которое представляет длительность
прошедшего времени в секундах. Вывести данное значение длительности
в часах, минутах и секундах в слудющем формате: ННч ММмин SSс
*/
public class linearFive {
	public static void main(String[] args) {
		int t = 365; // insert your time in sec
		getTime(t);
	}

	static void getTime(int t) {
		int hours = t/3600;
		int minuts = t/60-hours*60;
		int sec = t - (hours * 3600 + minuts * 60);
		System.out.println(hours + "ч " + minuts + "мин "
							+ sec + "с");
	}
}