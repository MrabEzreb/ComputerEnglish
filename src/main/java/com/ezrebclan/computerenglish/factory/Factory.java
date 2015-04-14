package com.ezrebclan.computerenglish.factory;

import com.ezrebclan.computerenglish.util.ResultValueBundle;

public abstract class Factory {

	public abstract ResultValueBundle<? extends FactoryProduct> createProduct();
}
