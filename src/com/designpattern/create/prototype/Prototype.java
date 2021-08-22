package com.designpattern.create.prototype;

public abstract class Prototype implements Cloneable {
	private String id;
	private ObjA obj;
	public Prototype(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public abstract Prototype Clone();

	public ObjA getObj() {
		return obj;
	}

	public void setObj(ObjA obj) {
		this.obj = obj;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Prototype type = (Prototype) super.clone();
		type.setObj((ObjA) this.obj.clone());
		return type;
	}
}
