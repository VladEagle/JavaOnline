// Вычислить значение функции
class functionValue {
    public static void main(String[] args) {
        System.out.println(findValue(4));
    }

    static double findValue(double x) {
    	double result = 0;
    	if(x <= 3) {
    		result = Math.pow(x, 2) - 3*x +9;
    	} else {
    		result = 1/(Math.pow(x, 3) + 6);
    	}
    	return result;
    }
}