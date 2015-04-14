package com.ezrebclan.computerenglish.statements;

import com.ezrebclan.computerenglish.Sentance;
import com.ezrebclan.computerenglish.exceptions.IncorrectSentanceType;

public class IfStructParser extends Sentance {

	private String condition = "";
	private String output = "";
	public IfStructParser(String sentance) throws IncorrectSentanceType {
		super(sentance);
		boolean hasIf = false;
		boolean hasThen = false;
		boolean hasIs = false;
		boolean hasOutput = false;
		if(this.words[0].equals("if")) {
			hasIf = true;
		} else {
			throw new IncorrectSentanceType();
		}
		for (int i = 0; i < words.length; i++) {
			if(words[i].equals("is")) {hasIs = true;}
		}
		for (int i = 0; i < words.length; i++) {
			if(words[i].equals("then")) {hasThen = true;}
			if(hasThen == true) {
				hasOutput = true;
			}
		}
	}
}
