package com.tvh.lights;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/******************************************************
 * 
 * This is the invoker command class
 * combined with the receiver methods as a concrete
 * implementation of the command
 *
 ***********************************{*******************/

public class CommandFactory {
	private final Map<String,Command> commands;
	
	private CommandFactory() {
		commands = new HashMap<>();
	}
	
	private void addCommand(final String name,final Command command) {
		commands.put(name,  command);
	}
	
	public static CommandFactory init() {
		final CommandFactory cf;
		cf = new CommandFactory();
		//****** These are the methods of a receiver ******
		cf.addCommand("Light on",() -> System.out.println("Light is turned on"));
		cf.addCommand("Light off",() -> System.out.println("Light is turned off"));
		//**************************************************
		return cf;
	}
	
	public void executeCommand(String name) {
		if (commands.containsKey(name)){
			commands.get(name).apply();
		}
	}
	
	public void listCommands() {
		System.out.println("Enabled commands: "+commands.keySet()
														.stream()
														.collect(Collectors.joining(", ")));
	}
}
