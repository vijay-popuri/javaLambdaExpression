package LambdaExpressions;

import java.util.Scanner;

interface Multiplication {
	double mul(int a, double b);
}

public class MultiplicationUsinfLambdas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer value");
		int a = sc.nextInt();
		System.out.println("Enter Double value");
		double b = sc.nextDouble();
		Multiplication ml = (a1, b1) -> (a1 * b1);
		double res = ml.mul(a, b);
		System.out.println(res);
	}

}
