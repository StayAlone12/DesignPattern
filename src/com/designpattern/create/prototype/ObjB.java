package com.designpattern.create.prototype;

public class ObjB implements Cloneable {
	public String name;
	
	public ObjB(String name) {
		this.name = name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
