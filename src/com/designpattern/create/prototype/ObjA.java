package com.designpattern.create.prototype;

public class ObjA implements Cloneable {
	public String name;
	public ObjB obj;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		ObjA objA = (ObjA) super.clone();
		objA.obj = (ObjB) this.obj.clone();
		return objA;
	}
}
