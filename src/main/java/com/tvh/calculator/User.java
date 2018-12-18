package com.tvh.calculator;

import java.util.ArrayList;
import java.util.List;

/******************************************************
 * 
 * This is the invoker command class
 * it asks the command to carry out requests
 *
 ******************************************************/

public class User {
	private Calculator calculator = new Calculator();
	private List<Command> commands = new ArrayList<>();
	private int currentLevel = 0;
	
	public void compute(char operator, float operand) {
		Command command = new CalculatorCommand(operator,operand,calculator);
		command.Execute();
		commands.add(command);
		currentLevel++;
	}
	
	public void redo(int levels) {
		System.out.println("****** Redo "+levels+" levels ******");
		for (int i = 0; i < levels; i++) {
			if (currentLevel < commands.size() - 1) {
				Command command = commands.get(currentLevel++);
				command.Execute();
			}
		}
	}
	
	public void undo(int levels) {
		System.out.println("****** Undo "+levels+" levels ******");
		for (int i = 0; i < levels; i++) {
			if (currentLevel > 0) {
				Command command = commands.get(--currentLevel);
				command.UnExecute();
			}
		}
	}
}
