package com.designpattern.create.factorymethod;

public class SubOpeartionFactory implements IOpeartionFactory {

	@Override
	public IOpeartion createOpeartion() {
		return new SubOpeartion();
	}

}
