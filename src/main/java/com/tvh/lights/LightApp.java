package com.tvh.lights;

/******************************************************
 * 
 * This is the client class
 *
 ******************************************************/

public class LightApp 
{
    public static void main( String[] args )
    {
    	final CommandFactory cf = CommandFactory.init();
		cf.listCommands();
		cf.executeCommand("Light on");
		cf.executeCommand("Light off");
		
    }
}