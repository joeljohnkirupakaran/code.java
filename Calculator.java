package week1.day3assignment;

public class Calculator {

	public void add(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		System.out.println(sum);
	}

	public void sub(int num1, int num2) {
		int substraction = num1 - num2;
		System.out.println(substraction);
	}

	public void mul(double num1, double num2) {
		double product = num1 * num2;
		System.out.println(product);
	}

	public void division(float num1, float num2) {
		float division = num1 / num2;
		System.out.println(division);

	}

	public static void main(String[] args) {
		Calculator calci = new Calculator();
		calci.add(1, 2, 3);
		calci.sub(4, 5);
		calci.mul(45d, 54d);
		calci.division(45f, 55f);

	}

}
