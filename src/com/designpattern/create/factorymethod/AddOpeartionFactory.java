package com.designpattern.create.factorymethod;

public class AddOpeartionFactory implements IOpeartionFactory {

	@Override
	public IOpeartion createOpeartion() {
		// TODO Auto-generated method stub
		return new AddOpeartion();
	}

}
