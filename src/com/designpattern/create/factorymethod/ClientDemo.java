package com.designpattern.create.factorymethod;

public class ClientDemo {

	public static void main(String[] args) {
		// 加法运算
		IOpeartionFactory addOpeartion = new AddOpeartionFactory();
		int addRes = addOpeartion.createOpeartion().getResult(10, 10);
		System.out.println("addRes:" + addRes);
		// 减法运算
		IOpeartionFactory subOpeartion = new SubOpeartionFactory();
		int subRes = subOpeartion.createOpeartion().getResult(10, 5);
		System.out.println("subRes:" + subRes);
	}
}
