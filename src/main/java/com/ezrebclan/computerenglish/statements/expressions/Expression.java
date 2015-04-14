package com.ezrebclan.computerenglish.statements.expressions;

import com.ezrebclan.computerenglish.factory.Factory;
import com.ezrebclan.computerenglish.statements.Statement;

public abstract class Expression extends Statement {

	private String sentance;
	public Expression(String sentance, Factory parent) {
		super(parent);
		this.sentance = sentance;
	}
	public abstract boolean evaluate();
	public String getSentance() {
		return sentance;
	}
}
