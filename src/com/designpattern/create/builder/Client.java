package com.designpattern.create.builder;

public class Client {

	public static void main(String[] args) {
		// 建造者A,创建了directorA
		Director.Builder builderA = new Director.Builder();
		builderA.setFileA(100).setFileB(10);
		Director directorA = builderA.bulid();
		
		// 建造者B,创建了directorB
		Director.Builder builderB = new Director.Builder();
		builderB.setFileA(10).setFileB(100);
		Director directorB = builderB.bulid();
	}
}
