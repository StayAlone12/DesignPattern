package com.designpattern.create.abstractfactory;

public class FactoryA implements IAbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA_01();
	}

	@Override
	public AbstractProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB_01();
	}

}
