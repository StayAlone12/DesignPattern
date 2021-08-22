package com.designpattern.create.builder;

/**
 * 指挥类
 * 
 * @author LJ
 *
 */
public class Director {
	// 字段A
	private int fileA;
	
	// 字段B
	private int fileB;
	
	public Director(Builder builder) {
		this.fileA = builder.getFileA();
		this.fileB = builder.getFileB();
	}
	
	public static class Builder {
		// 字段A
		private int fileA;
		
		// 字段B
		private int fileB;
		
		public int getFileA() {
			return fileA;
		}
		
		public Builder setFileA(int fileA) {
			this.fileA = fileA;
			return this;
		}
		
		public int getFileB() {
			return fileB;
		}
		
		public Builder setFileB(int fileB) {
			this.fileB = fileB;
			return this;
		}
		
		public Director bulid() {
			return new Director(this);
		}
	}
}
