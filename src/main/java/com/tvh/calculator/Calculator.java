package com.tvh.calculator;

/******************************************************
 * 
 * This is the receiver class: 
 * it knows how to perform the operations
 *
 ******************************************************/

public class Calculator {

	private float value = 0f;

	public void operation(char operation, float operand) {
		switch (operation) {
		case '+':
			value += operand;
			break;
		case '-':
			value -= operand;
			break;
		case '*':
			value *= operand;
			break;
		case '/':
			value /= operand;
			break;
		}
		System.out.println("The resulting value is " + value);
	}
}
