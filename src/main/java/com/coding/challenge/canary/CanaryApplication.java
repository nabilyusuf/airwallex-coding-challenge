package com.coding.challenge.canary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Stack;

@SpringBootApplication
public class CanaryApplication {
	private static Stack<Integer> stack = new Stack<Integer>();
	private static Scanner input = new Scanner(System.in);


	public static void main(String[] args) {
		SpringApplication.run(CanaryApplication.class, args);
		Calculator calculator = new Calculator();
		System.out.println("Welcome to the RPN Calculator program (Type EXIT to terminate)!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Input (Type EXIT to terminate) : ");
		while(sc.hasNext()) {
			String s1 = sc.nextLine() ;
			if(s1.equals("EXIT")) {
				break;
			}
			try {
				// calculate which throw exception.
				throw new CalculatorException("Test Exception");
			} catch (CalculatorException e) {
				System.out.println(e.getMessage());
			}
			DecimalFormat fmt = new DecimalFormat("0.##########");
			Stack<Double> stack = calculator.getValuesStack();
			System.out.print("Stack: ");
			for (Double value : stack) {
				System.out.print(fmt.format(value));
				System.out.print(" ");
			}
			System.out.printf("%n");
		}


	}
}
