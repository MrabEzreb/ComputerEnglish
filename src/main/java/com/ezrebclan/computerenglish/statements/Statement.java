package com.ezrebclan.computerenglish.statements;

import com.ezrebclan.computerenglish.factory.Factory;
import com.ezrebclan.computerenglish.factory.FactoryProduct;

public abstract class Statement extends FactoryProduct {

	public Statement(Factory parent) {
		super(parent);
	}
	public abstract boolean evaluate();
	public abstract String toJava();
}
