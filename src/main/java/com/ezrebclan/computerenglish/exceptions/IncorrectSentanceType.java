package com.ezrebclan.computerenglish.exceptions;

public class IncorrectSentanceType extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 154984971467302736L;

	@Override
	public String getMessage() {
		return "IncorrectSentanceType. Why the HEEEEECK is this crashing the program? If it doesn't crash the program, then good, but if you get a nullpointer or somethin later on down the line, blame this stack trace, if there is a stack trace. lol";
	}
}
