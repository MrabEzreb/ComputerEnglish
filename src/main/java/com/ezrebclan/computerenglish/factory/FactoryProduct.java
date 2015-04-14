package com.ezrebclan.computerenglish.factory;

public class FactoryProduct {

	private Factory parent;
	public FactoryProduct(Factory parent) {
		this.parent = parent;
	}
	public Factory getParentFactory() {
		return this.parent;
	}
}
