package com.tvh.calculator;

/******************************************************
 * 
 * This is the client class
 *
 ******************************************************/

public class CalculatorApp 
{
    public static void main( String[] args )
    {
        User user = new User();
        
        user.compute('+',12);
        user.compute('-',2);
        user.compute('*',10);
        user.compute('/',25);
        
        user.undo(3);
        
        user.redo(2);
    }
}
