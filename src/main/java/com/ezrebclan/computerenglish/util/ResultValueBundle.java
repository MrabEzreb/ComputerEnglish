package com.ezrebclan.computerenglish.util;

public class ResultValueBundle<ValueType> {

	private boolean result;
	private ValueType value;
	public ResultValueBundle(boolean result, ValueType value) {
		this.result = result;
		this.value = value;
	}
	public ValueType getValue() {
		return value;
	}
	public boolean getResult() {
		return result;
	}
}
