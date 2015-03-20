package com.ezrebclan.computerenglish.statements;

import com.ezrebclan.computerenglish.Sentance;

public class IfStructParser extends Sentance {

	private String condition = "";
	private String output = "";
	public IfStructParser(String sentance) {
		super(sentance);
		boolean hasIf = false;
		boolean hasThen = false;
		boolean hasIs = false;
		boolean hasOutput = false;
		if(this.words[0].equals("if")) {
			hasIf = true;
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
