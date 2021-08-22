package com.designpattern.create.abstractfactory;

/**
 * 抽象工厂接口
 * 
 * @author LJ
 *
 */
public interface IAbstractFactory {
	AbstractProductA createProductA();
	AbstractProductB createProductB();
}
