/*
Напишите программу, где пользователь вводит любое целое положительное
число. А программа суммирует все числа от 1 до введенного пользователем числа.
*/
public class loopOne {
	public static void main(String[] args) {
		int num = 3; // insert your number here
		int sum = 0;
		for(int i = 0; i <= num; sum += i++) {} 
		System.out.println(sum);
	}
}