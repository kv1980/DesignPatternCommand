package com.tvh.calculator;

/********************************************************************
 * 
 * This is the concrete command class
 * it implements the (un)execute-methods by invoking the
 * corresponding operation of the receiver
 *
 *******************************************************************/

public class CalculatorCommand implements Command {
	private char operator;
	private float operand;
	private Calculator calculator;	

	public CalculatorCommand(char operator, float operand,Calculator calculator) {
		super();
		this.operator = operator;
		this.operand = operand;
		this.calculator = calculator;
	}	

	public void Execute() {
		calculator.operation(operator,operand);
	}

	public void UnExecute() {
		calculator.operation(reverse(operator),operand);
	}
	
	private char reverse(char operator) {
		switch (operator) {
			case '+': return '-';
			case '-': return '+';
			case '*': return '/';
			case '/': return '*';
			default: throw new IllegalArgumentException();
		}
	}

}
