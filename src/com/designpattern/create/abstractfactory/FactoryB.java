package com.designpattern.create.abstractfactory;

public class FactoryB implements IAbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA_02();
	}

	@Override
	public AbstractProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB_02();
	}

}
