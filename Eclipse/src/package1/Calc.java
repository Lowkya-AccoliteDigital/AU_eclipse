package package1;

import java.util.Scanner;

public class Calc implements Calculator {

	@Override
	public int add(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1 + number2;
	}

	@Override
	public int subract(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1 - number2;
	}

	@Override
	public int multiply(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1 * number2;
	}

	@Override
	public int divide(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1 / number2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc =new Calc();
		Scanner scan =new Scanner(System.in);
		
		int number1= scan.nextInt();
		int number2= scan.nextInt();
		String operator =scan.next();
		
		try{
			
			switch(operator)
			{
			case "+":
				System.out.println( calc.add(number1, number2));
				break;
			case "-":
				System.out.println( calc.subract(number1, number2));
				break;
			case "*":
				System.out.println( calc.multiply(number1, number2));
				break;
			case "/":
				System.out.println( calc.divide(number1, number2));
				break;
			case "power":
				System.out.println( calc.power(number1, number2));
				break;
			default:
				System.out.println("this not the operator expected");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception raised");
		}
	}

	@Override
	public double power(int number1, int number2) {
		// TODO Auto-generated method stub
		return Math.pow(number1, number2);
	}

}
