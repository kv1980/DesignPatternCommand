package com.tvh.lights;


/******************************************************
 * 
 * This is the interface command class
 *
 ******************************************************/

@FunctionalInterface
public interface Command {
	public void apply();
}
