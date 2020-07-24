package epamht3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Welcome to simple calculator!!");
		boolean n = true;
		Scanner sc = new Scanner(System.in);
		while(n) {
			System.out.println("Operations available:-");
			System.out.println("ADD +");
			System.out.println("SUBTRACT - ");
			System.out.println("MULTIPLY *");
			System.out.println("DIVIDE /");
			System.out.println("Enter the numbers to perform the operations on");
			double x, y;
			x = sc.nextDouble();
			y = sc.nextDouble();
			System.out.println("Select an operator(+ - * /)");
			char choice = sc.next().charAt(0);
			double ans = 0;
			char rep;
			try {
				Operations op = new Operations();
			switch(choice) {
				case '+':
					ans = op.add(x,y);
					System.out.println("The sum = " +ans);
					System.out.println("Do you want to perform any other operations? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						System.out.println("Thankyou! :)");
						break;
					}
				case '-':
				    ans = op.subtract(x, y);
					System.out.println("The difference = " +ans);
					System.out.println("Do you want to perform any other operations? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						System.out.println("Thankyou! :)");
						break;
					}
				case '*':
				    ans = op.multiply(x, y);
					System.out.println("The product = " +ans);
					System.out.println("Do you want to perform any other operations? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						System.out.println("Thankyou! :)");
						break;
					}
				case '/':
				    ans = op.divide(x, y);
					System.out.println("The quotient = " +ans);
					System.out.println("Do you want to perform any other operations? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						System.out.println("Thankyou for you using the simple calculator! :)");
						break;
					}
				}
			} catch(Exception e) {
	        	System.out.println("Please select a valid operator!");
			}
		}
	}

}
