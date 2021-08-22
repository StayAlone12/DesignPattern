package com.designpattern.create.abstractfactory;

public class Client {

	public static void main(String[] args) {
		IAbstractFactory factoryA = new FactoryA();
		AbstractProductA productA_01 = factoryA.createProductA();
		productA_01.methodA();
		AbstractProductB productB_01 = factoryA.createProductB();
		productB_01.methodB();
		
		IAbstractFactory factoryB = new FactoryB();
		AbstractProductA productA_02 = factoryB.createProductA();
		productA_02.methodA();
		AbstractProductB productB_02 = factoryB.createProductB();
		productB_02.methodB();
	}

}
