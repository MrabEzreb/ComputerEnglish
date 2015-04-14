package com.ezrebclan.computerenglish.statements.expressions;

import com.ezrebclan.computerenglish.factory.Factory;

public class IsExpression extends Expression {

	public IsExpression(String sentance, Factory parent) {
		super(sentance, parent);
		
	}

	@Override
	public boolean evaluate() {
		return false;
	}

	@Override
	public String toJava() {
		return null;
	}

}
