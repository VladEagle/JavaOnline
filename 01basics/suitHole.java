/*
Заданы размеры А В прямоугольного отверстия,
определить пройдет ли кирпич с размерами x y z через это отверстие.
*/

public class suitHole {
	
	public static void main(String[] args) {
		int[] brick = new int[]{3, 5, 2};
		System.out.println(checkSuitSize(brick, 2, 2));
	}
	// check if the brick is suitable for the holl
	static boolean checkSuitSize(int[] brick, int x, int y) {
		if( (brick[0] <= x && brick[2] <= y ) || (brick[2] <= x && brick[0] <= y))
		return true;

		if( (brick[0] <= x && brick[1] <= y ) || (brick[1] <= x && brick[0] <= y))
		return true;

		if( (brick[1] <= x && brick[2] <= y ) || (brick[2] <= x && brick[1] <= y))
		return true;

		return false;
	}
}