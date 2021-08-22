package com.designpattern.create.prototype;

public class ConcretePrototypeA extends Prototype {
	public ConcretePrototypeA(String id) {
		super(id);
	}

	@Override
	public Prototype Clone() {
		try {
			return (Prototype) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
