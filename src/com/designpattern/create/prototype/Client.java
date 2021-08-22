package com.designpattern.create.prototype;

public class Client {
	public static void main(String[] args) {
		ConcretePrototypeA cp = new ConcretePrototypeA("owen");
		ObjB objB = new ObjB("objB");
		ObjA objA = new ObjA();
		objA.obj = objB;
		objA.name = "objA name";
		cp.setObj(objA);
		ConcretePrototypeA cp2 = (ConcretePrototypeA) cp.Clone();
		System.out.println(cp2.getObj() == cp.getObj());
		System.out.println(cp2.getObj().name);
		objA.name = "objA name change";
		System.out.println(cp2.getObj().name);
	}
}
